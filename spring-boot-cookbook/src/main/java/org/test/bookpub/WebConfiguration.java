package org.test.bookpub;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.test.bookpub.repository.BookRepository;

/**
 * Created by leandro.maro on 18/05/17.
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    private BookRepository bookRepository;

    /**
     * By registering our formatter with the FormatterRegistry in the overridden
     * addFormatters method, we are instructing Spring to use our Formatter
     * to translate a textual representation of our Book into an entity object and back
     * @param registry
     */


    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new BookFormatter(bookRepository));
    }

    @Bean
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }

    /**
     * An interceptor gives us cutaway points at different phases:
     * => before the request gets handled,
     * => after the request has been processed,
     * => before the view has been rendered,
     * => and at the very end,
     * => after the request has been fully completed.
     */

    @Bean
    public  LocaleChangeInterceptor	localeChangeInterceptor()	{
        return	new LocaleChangeInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry)	{
        registry.addInterceptor(localeChangeInterceptor());
    }

    /**
     * Declaring HttpMessageConverter as @Bean is a simple
     * way of adding a custom converter to the application
     * The purpose of HttpMessageConverters is to translate
     * various object types into their corresponding HTTP output formats
     */
    @Bean
    public ByteArrayHttpMessageConverter byteArrayHttpMessageConverter() {
        return new ByteArrayHttpMessageConverter();
    }

}

package org.test.bookpub;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * Created by leandro.maro on 18/05/17.
 *
 *
 * An interceptor gives us cutaway points at different phases:
 * => before the request gets handled,
 * => after the request has been processed,
 * => before the view has been rendered,
 * => and at the very end,
 * => after the request has been fully completed.
 *
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {
    @Bean
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }

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
     * @return
     */
    @Bean
    public ByteArrayHttpMessageConverter byteArrayHttpMessageConverter() {
        return new ByteArrayHttpMessageConverter();
    }

}

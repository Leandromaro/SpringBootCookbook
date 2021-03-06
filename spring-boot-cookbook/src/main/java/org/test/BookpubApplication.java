package org.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.test.bookpub.StartupRunner;

@SpringBootApplication
@EnableScheduling
public class BookpubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookpubApplication.class, args);
	}

	@Bean
	//Indicates that a method produces a bean to be managed by the Spring container.
	public StartupRunner schedulerRunner()	{
		return	new	StartupRunner();
	}
}

package com.spring.dispatcherservlet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.spring"})
public class ConfigurationClass 
{
	 @Bean
     public InternalResourceViewResolver getResolver()
     {
    	 InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    	 
    	 resolver.setPrefix("/WEB-INF/views/");
    	 resolver.setSuffix(".jsp");
    	 return resolver;
     }
}

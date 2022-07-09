package com.spring.primary.annoation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.spring.primary.annoation")
public class MobileConfig
{   
  /*  @Bean()
   // @Primary
    public Mobile getSamSungMobile()
    {
        return new Samsung("Samsung", 150000);
    }
    
    @Bean
    //@Primary
    public Mobile getRedmiMobile()
    {
        return new Redmi("Redmi", 18000);
    }
   */
    
    /*
     * if we don't use primary annotation then there will be some conflict
     * 
     * -> No qualifying bean of type 'com.spring.primary.annoation.Mobile' available: expected single matching bean but found 2: getSamSungMobile,getRedmiMobile
     *
     * To resolve this conflict we can make one of the bean as a primary
     * so for that we can use @Primary annotation which will help to resolve the exception when there were many bean of same type
     */
}

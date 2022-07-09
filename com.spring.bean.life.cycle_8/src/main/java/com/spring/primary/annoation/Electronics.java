package com.spring.primary.annoation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Electronics
{
    @Autowired
   // @Qualifier(value = "Samsung")  // if we are using primary annotation then no need to use this
    private Mobile mobile;
    
    public Mobile getMobile()
    {
        return mobile;
    }

    public void save()
    {
        System.out.println("Saving Electronics");
    }
}

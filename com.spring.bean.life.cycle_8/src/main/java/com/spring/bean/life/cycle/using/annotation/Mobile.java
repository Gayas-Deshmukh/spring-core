package com.spring.bean.life.cycle.using.annotation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mobile implements Serializable
{
    private String mobileName;

    public String getMobileName()
    {
        return mobileName;
    }

    public void setMobileName(String mobileName)
    {
        System.out.println("Setting mobile name");
        this.mobileName = mobileName;
    }

    public Mobile()
    {
        super();
       System.out.println("Creating Mobile Object");
    }

    @Override
    public String toString()
    {
        return "Mobile [mobileName=" + mobileName + "]";
    }
   
    @PostConstruct
    public void init()
    {
        System.out.println("Calling init method");
    }
    
    @PreDestroy
    public void destroy()
    {
        System.out.println("Calling destroy method");
    }
}

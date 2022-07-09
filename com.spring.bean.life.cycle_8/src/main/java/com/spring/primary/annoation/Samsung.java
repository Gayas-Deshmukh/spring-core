package com.spring.primary.annoation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Samsung")
@Primary
public class Samsung implements Mobile
{
    private String name;
    private double price;
        
    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public Samsung(String name, double price)
    {
        super();
        this.name = name;
        this.price = price;
    }
    
    public Samsung()
    {
        super();
        this.name = "Samsung";
        this.price = 14522.00;
    }

    @Override
    public void getdetails()
    {
        System.out.println("Mobile Name:" + name + " Mobile Price:"+ price);
    }
     
}

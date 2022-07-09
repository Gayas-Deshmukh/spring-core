package com.spring.primary.annoation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Redmi")
//@Primary
public class Redmi implements Mobile
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

    public Redmi(String name, double price)
    {
        super();
        this.name = name;
        this.price = price;
    }
    
    public Redmi()
    {
        super();
        this.name = "Redmi";
        this.price = 1233.00;
    }

    @Override
    public void getdetails()
    {
        System.out.println("Mobile Name:" + name + " Mobile Price:"+ price);
    }
}

package com.spring.bean.life.cycle.using.xml;

import java.io.Serializable;

public class Product implements Serializable
{
    private int price;

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        System.out.println("Setting Price th'r setter method");
        this.price = price;
    }

    public Product()
    {
        super();
       System.out.println("Product constructor get called");
    }

    @Override
    public String toString()
    {
        return "Product [price=" + price + "]";
    }
    
    // we can give any custom name for initializing & Destroy method
    
    public void init() 
    {
        System.out.println("Init method get called");
    }
    
    public void destroy()
    {
        System.out.println("Destroy method is called");
    }
    
}

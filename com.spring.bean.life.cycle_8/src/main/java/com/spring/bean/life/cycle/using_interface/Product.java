package com.spring.bean.life.cycle.using_interface;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Product implements Serializable, InitializingBean, DisposableBean
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
    
    public void afterPropertiesSet() throws Exception
    {
        System.out.println(" Called afterPropertiesSet method ");     
    }

    public void destroy() throws Exception
    {
        System.out.println(" Called destroy method ");      
    }
       
}

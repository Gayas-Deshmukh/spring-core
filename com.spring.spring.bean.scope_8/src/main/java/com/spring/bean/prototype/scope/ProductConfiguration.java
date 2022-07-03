package com.spring.bean.prototype.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.bean.prototype.scope")
public class ProductConfiguration
{
    /*
     * Injecting Prototype Scope bean into Singleton Scope bean
     
    @Autowired
    private Product product;
    
    @Bean
    public Order order()
    {
        Order order = new Order();
        order.setOrderType("Books");
        order.setProduct(product);
        
        return order;
    }
    
    */
    
    /*
     * Injecting Singleton Scope bean into Prototype Scope bean
     */
    
    @Autowired
    private Product product;
    
    @Bean
    public Order order()
    {
        Order order = new Order();
        order.setOrderType("Books");
        
        return order;
    }
}

package com.spring.spring.bean.singleton.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.spring.bean.singleton.scope")
public class ProductConfiguration
{
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
}

package com.spring.spring.bean.singleton.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductConfigTest
{

    public static void main(String[] args)
    {
        ApplicationContext context  =   new AnnotationConfigApplicationContext(ProductConfiguration.class);
        
        Product product1 = context.getBean(Product.class);     
        System.out.println("Product 1 :" + product1.hashCode()); //1665197552
        
        Product product2 = context.getBean(Product.class);
        System.out.println("Product 2 :" + product2.hashCode()); //1665197552
        
        System.out.println("-----------------------------------------------------------");
        
        Order order1    =   context.getBean(Order.class);
        System.out.println("Order 1 :" + order1.hashCode());    //1813666644
        
        Order order2    =   context.getBean(Order.class);
        System.out.println("Order 2 :" + order2.hashCode());   //1813666644
        
        
        /*
         * Each time when we request for a bean we will get the same bean 
         * so in this case these beans have Singleton bean scope means from a container if we request for a bean it will give us same bean
         * for to get different bean we have to create different container.
         */

    }

}

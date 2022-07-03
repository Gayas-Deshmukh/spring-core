package com.spring.bean.prototype.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductConfigTest_2
{
    public static void main(String[] args)
    {
        ApplicationContext context  =   new AnnotationConfigApplicationContext(ProductConfiguration.class);
        
        /*
         * Injecting Singleton Scope bean into Prototype Scope bean
         * 
         * when a Singleton scope bean is injecting into the Prototype scope bean, then the Singleton scope bean will be injected at only once into the Prototype beans, no matter how many times the prototype beans are creating. 
         * Because singleton bean will create only once throughout the container.
         */
        
        Product product4 = context.getBean(Product.class);     
        System.out.println("Product 4 :" + product4.hashCode()); 
        System.out.println("Order hashCode in Product 4 : " + product4.getOrder().hashCode());
        
        Product product5 = context.getBean(Product.class); 
        System.out.println("Product 5 :" + product5.hashCode());
        System.out.println("Order hashCode in Product 5 : " + product5.getOrder().hashCode());
        
        /*
         * Output
         * 
         *  Product 4 :1813666644
            Order hashCode in Product 4 : 914507705
            Product 5 :443384617
            Order hashCode in Product 5 : 914507705

         */
    }
}

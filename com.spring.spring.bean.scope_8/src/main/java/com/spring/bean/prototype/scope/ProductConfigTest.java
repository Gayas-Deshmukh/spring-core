package com.spring.bean.prototype.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductConfigTest
{

    public static void main(String[] args)
    {
        ApplicationContext context  =   new AnnotationConfigApplicationContext(ProductConfiguration.class);
        
        Product product1 = context.getBean(Product.class);     
        System.out.println("Product 1 :" + product1.hashCode()); //914507705
        
        Product product2 = context.getBean(Product.class);
        System.out.println("Product 2 :" + product2.hashCode()); //121167003
        
        /*
         * whenever we request for the prototype scope bean then each time we will get different bean reference if it has prototype scope
         */
        
        System.out.println("-----------------------------------------------------------");
        
        Order order1    =   context.getBean(Order.class);
        System.out.println("Order 1 :" + order1.hashCode());    //1014486152
        
        Order order2    =   context.getBean(Order.class);
        System.out.println("Order 2 :" + order2.hashCode());   //1014486152
        
        System.out.println("-----------------------------------------------------------");
        
        /*
         * Injecting Prototype Scope bean into Singleton Scope bean
         */
        
        /*
         * when Prototype bean is injected into singleton bean scope bean then product is (prototype bean) is created only once i.e. it become Singleton bean
         * i.e
         * when a prototype scope bean is injecting into the singleton scope bean, then the prototype scope bean will be injected at only once into the singleton bean while singleton bean creation. 
         * Because singleton bean will create only once and during that time only one the prototype bean will be injected.
         */
        
        Order order3    =   context.getBean(Order.class);
        System.out.println("Order 3 :" + order3.hashCode());    //1014486152
        System.out.println("Order 3 Product :" + order3.getProduct().hashCode()); // 1664576493
        
        Order order4    =   context.getBean(Order.class);
        System.out.println("Order 4 :" + order4.hashCode());    //1014486152
        System.out.println("Order 4 Product :" + order4.getProduct().hashCode()); // 1664576493
        
       
        /*
         * when Prototype bean is injected into singleton bean scope bean then prototype bean become singleton bean?
         * Ans : No  
         */
        Product product3 = context.getBean(Product.class);   
        System.out.println("Product 3 :" + product3.hashCode()); //1095088856
        
        System.out.println("--------------------------------------------------------------------------------");
       
    }

}

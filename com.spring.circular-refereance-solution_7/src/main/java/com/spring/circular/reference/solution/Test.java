package com.spring.circular.reference.solution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test
{
    public static void main(String[] args)
    {
        
        
        ApplicationContext context  =   new AnnotationConfigApplicationContext(CustomerBeanConfig.class);
        
        CustomerBean customer    =   context.getBean(CustomerBean.class);
        
        System.out.println(customer);
        System.out.println(customer.getHomeLoanAccount().getHomeLoanAmount());
        
        /*
         * so here when spring container is get created then it will create only
         * homeLoanAccount spring bean & inject the proxy customerbean spring object when homeLoanAccount requires the Customer object
         * later when we request for customer bean then only Customer bean will get created & inside it HomeLoanAccount 
         * object get loaded 
         * this  HomeLoanAccount's proxy object will get updated with this newly created CustomerBean object.
         */
    }
}

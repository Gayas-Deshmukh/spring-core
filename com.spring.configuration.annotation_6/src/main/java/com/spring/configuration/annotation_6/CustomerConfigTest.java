package com.spring.configuration.annotation_6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerConfigTest
{

    public static void main(String[] args)
    {
       /* First way without using xml
         - no need to define anything in the xml file
        */
       // ApplicationContext context  =   new AnnotationConfigApplicationContext(CustomerConfig.class);
       
      /*  - we can use mix of both Java annotation & xml approach 
          - for xml approach we need to define the following properties inside xml file i.e define config class as bean class & enable @Autowired annotation
           <context:annotation-config/>
           <bean class="com.spring.configuration.annotation_6.CustomerConfig"/>
      */
        
        // Second way using xml 
        ApplicationContext context  =   new ClassPathXmlApplicationContext("com.spring.configuration.annotation.xml");
        
        CustomerBean    customer    =   context.getBean(CustomerBean.class);
        
        System.out.println(("CustomerBean : " + customer));
        
        System.out.println("HomeLoanAmount :" + customer.getHomeLoanAccount().getHomeLoanAmount());
        
        System.out.println("PersonalLoanAmount :" + customer.getPersonalLoanAccount().getPersonalLoanAmount());
    }

}

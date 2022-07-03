package com.spring.configuration.annotation_6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// this class is alternative to configuration Xml file.
// here we are defining the bean that spring core container will create.
// But to inject these beans into CustomerBean we can use autowire th'r component scan.

/* Note -
   1.@Component will be used with @ComponentScan to auto detect as a spring bean when it is in matching package.
    (we can define multiple packages inside @ComponentScan but those packages should have Java bean with @Component annotation )
   2.@Bean annotation will always be used with @Configuration annotation & it will always be mark as a java bean object annotated 
     with @Bean to make it as a spring bean.
   3.when any external jar file is used , and if the classes in that external files are to be defined as spring beans, then we can go with
     the @Bean annotation by creating an object for those external classes inside this class & we can mark them as a spring beans using 
     @Bean annotation. 
*/

@Configuration
@ComponentScan(basePackages = {"com.spring.configuration.annotation_6"})
public class CustomerConfig
{  
  
    @Bean
    public HomeLoanAccount getHomeLoanAccount()
    {
        HomeLoanAccount account =   new HomeLoanAccount();
        account.setHomeLoanAmount(2555);
        account.setHomeLoanId(111);
        System.out.println("Created HomeLoanAccount Bean");
        
        return account;
    }
    
    @Bean
    public PersonalLoanAccount getPersonalLoanAccount()
    {
        PersonalLoanAccount account =   new PersonalLoanAccount();
        account.setPersonalLoanAmountId(222);
        account.setPersonalLoanAmount(85000);
        
        System.out.println("Created PersonalLoanAccount Bean");
        
        return account;
        
    }
}

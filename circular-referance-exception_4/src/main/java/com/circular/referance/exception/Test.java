package com.circular.referance.exception;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{

    public static void main(String[] args)
    {
        Resource resource   =   new ClassPathResource("circular-referance-injection.xml");
        
        BeanFactory factory =   new XmlBeanFactory(resource);
        
        CustomerBean  customer  =   factory.getBean(CustomerBean.class);
        
        System.out.println("CutomerBeanObject: " + customer);
        System.out.println("HomeLoanAccount in CustomerBean: " + customer.getHomeLoanAccount());
        
        System.out.println("----------------------------------------------------------");
        
        HomeLoanAccount account =   factory.getBean(HomeLoanAccount.class);
        
        System.out.println("HomeLoanAccountObject : " + account );
        System.out.println("CustomerBean in HomeLoan Account : " + account.getCustomer() );


    }

}

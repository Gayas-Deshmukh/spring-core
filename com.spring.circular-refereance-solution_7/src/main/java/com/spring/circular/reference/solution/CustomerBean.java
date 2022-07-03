package com.spring.circular.reference.solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CustomerBean
{
    private String          customerId;
    private String          customerName;
    private HomeLoanAccount homeLoanAccount;
  
    public HomeLoanAccount getHomeLoanAccount()
    {
        return homeLoanAccount;
    }
    
    // Constructor Injection
    @Autowired
    public CustomerBean(HomeLoanAccount homeLoanAccount)
    {
        super();
        System.out.println("Creating Customer bean ...");
        this.homeLoanAccount = homeLoanAccount;
    }
    
    
    @Override
    public String toString()
    {
        return "CustomerBean [customerId=" + customerId + ", customerName=" + customerName + ", homeLoanAccount=" + homeLoanAccount + "]";
    }
 
}

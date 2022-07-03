package com.spring.circular.reference.solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeLoanAccount
{
    private int             homeLoanAmount = 2000;
    private CustomerBean    customer;
    
    public int getHomeLoanAmount()
    {
        return homeLoanAmount;
    }

    public void setHomeLoanAmount(int homeLoanAmount)
    {
        this.homeLoanAmount = homeLoanAmount;
    }

    public CustomerBean getCustomer()
    {
        return customer;
    }

    @Autowired
    public void setCustomer(CustomerBean customer)
    {
        this.customer = customer;
    }

    // Constructor injection
    // @Autowired
    /*
      public HomeLoanAccount( CustomerBean customer) { super();
      System.out.println("Creating HomeLoanAccount bean ...");
      
      this.customer = customer; }
    */
    
    
     
}

package com.circular.referance.exception;

public class HomeLoanAccount
{
    private int             homeLoanAmount;
    private CustomerBean    customer;
    
    // Setter Injection - Achieved partial dependencies
    
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
    public void setCustomer(CustomerBean customer)
    {
        this.customer = customer;
    }
   
   
    /*
    // Constructor injection
    public HomeLoanAccount(int homeLoanAmount, CustomerBean customer)
    {
        super();
        System.out.println("Creating HomeLoanAccount bean ...");
        this.homeLoanAmount = homeLoanAmount;
        this.customer = customer;
    }  
    */
    
    /*
    @Override
    public String toString()
    {
        return "HomeLoanAccount [homeLoanAmount=" + homeLoanAmount + ", customer=" + customer + "]";
    }
   */
}

package com.circular.referance.exception;

public class CustomerBean
{
    private String          customerId;
    private String          customerName;
    private HomeLoanAccount homeLoanAccount;
  
    // Setter Injection - Achived partial dependencies
    /*
    public String getCustomerId()
    {
        return customerId;
    }
    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public HomeLoanAccount getHomeLoanAccount()
    {
        return homeLoanAccount;
    }
    public void setHomeLoanAccount(HomeLoanAccount homeLoanAccount)
    {
        this.homeLoanAccount = homeLoanAccount;
    }
    */
    
    // Constructor Injection
    public CustomerBean(String customerId, String customerName, HomeLoanAccount homeLoanAccount)
    {
        super();
        System.out.println("Creating Customer bean ...");
        this.customerId = customerId;
        this.customerName = customerName;
        this.homeLoanAccount = homeLoanAccount;
    }
    
    
    @Override
    public String toString()
    {
        return "CustomerBean [customerId=" + customerId + ", customerName=" + customerName + ", homeLoanAccount=" + homeLoanAccount + "]";
    }
 
}

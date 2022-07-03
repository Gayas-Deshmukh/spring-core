package com.spring.configuration.annotation_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerBean
{
    private String              customerId;
    private String              customerName;
    
   // @Autowired
    private HomeLoanAccount     homeLoanAccount;
    
   // @Autowired
    private PersonalLoanAccount personalLoanAccount;
    
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
    
    @Autowired
    public void setHomeLoanAccount(HomeLoanAccount homeLoanAccount)
    {
        this.homeLoanAccount = homeLoanAccount;
        System.out.println("Setter HomeLoanAccount called ...");
    }
    public PersonalLoanAccount getPersonalLoanAccount()
    {
        return personalLoanAccount;
    }
    
    @Autowired
    public void setPersonalLoanAccount(PersonalLoanAccount personalLoanAccount)
    {
        this.personalLoanAccount = personalLoanAccount;
        System.out.println("Setter PersonalLoanAccount called ...");
    }
    
    @Override
    public String toString()
    {
        return "CustomerBean [customerId=" + customerId + ", customerName=" + customerName + ", homeLoanAccount=" + homeLoanAccount + ", personalLoanAccount="
                + personalLoanAccount + "]";
    }
    
   
 
}

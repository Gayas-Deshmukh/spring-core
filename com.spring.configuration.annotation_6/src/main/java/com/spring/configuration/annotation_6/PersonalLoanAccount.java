package com.spring.configuration.annotation_6;

public class PersonalLoanAccount
{
    private int personalLoanAmount;
    private int personalLoanAmountId;
    
    public int getPersonalLoanAmount()
    {
        return personalLoanAmount;
    }
    public void setPersonalLoanAmount(int personalLoanAmount)
    {
        this.personalLoanAmount = personalLoanAmount;
    }
    public int getPersonalLoanAmountId()
    {
        return personalLoanAmountId;
    }
    public void setPersonalLoanAmountId(int personalLoanAmountId)
    {
        this.personalLoanAmountId = personalLoanAmountId;
    }
    
    @Override
    public String toString()
    {
        return "PersonalLoanAccount [personalLoanAmount=" + personalLoanAmount + ", personalLoanAmountId=" + personalLoanAmountId + "]";
    }
  
}

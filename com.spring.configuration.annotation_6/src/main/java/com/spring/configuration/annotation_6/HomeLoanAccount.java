package com.spring.configuration.annotation_6;

public class HomeLoanAccount
{
    private int homeLoanAmount;
    private int homeLoanId;
    
    public int getHomeLoanAmount()
    {
        return homeLoanAmount;
    }
    public void setHomeLoanAmount(int homeLoanAmount)
    {
        this.homeLoanAmount = homeLoanAmount;
    }
    public int getHomeLoanId()
    {
        return homeLoanId;
    }
    public void setHomeLoanId(int homeLoanId)
    {
        this.homeLoanId = homeLoanId;
    }
    
    @Override
    public String toString()
    {
        return "HomeLoanAccount [homeLoanAmount=" + homeLoanAmount + ", homeLoanId=" + homeLoanId + "]";
    }
    
}

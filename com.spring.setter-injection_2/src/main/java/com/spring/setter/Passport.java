package com.spring.setter;

import java.util.*;

public class Passport
{
    private int                 passportNO;
    private String              passportType;
    private List                countryList;
    private Set                 countryCode;
    private Map<Integer,String> fightInfo;
    private Properties          additionalInfo;
    private Cutomer             customer;
    
    public int getPassportNO()
    {
        return passportNO;
    }
    
    public void setPassportNO(int passportNO)
    {
        this.passportNO = passportNO;
    }
    
    public String getPassportType()
    {
        return passportType;
    }
    
    public void setPassportType(String passportType)
    {
        this.passportType = passportType;
    }
    
    public List getCountryList()
    {
        return countryList;
    }
    
    public void setCountryList(List countryList)
    {
        this.countryList = countryList;
    }
    public Set getCountryCode()
    {
        return countryCode;
    }
    
    public void setCountryCode(Set countryCode)
    {
        this.countryCode = countryCode;
    }
    
    public Map<Integer, String> getFightInfo()
    {
        return fightInfo;
    }
    
    public void setFightInfo(Map<Integer, String> fightInfo)
    {
        this.fightInfo = fightInfo;
    }
    
    public Properties getAdditionalInfo()
    {
        return additionalInfo;
    }
    
    public void setAdditionalInfo(Properties additionalInfo)
    {
        this.additionalInfo = additionalInfo;
    }
    
    public Cutomer getCustomer()
    {
        return customer;
    }
    
    public void setCustomer(Cutomer customer)
    {
        this.customer = customer;
    }
    
    @Override
    public String toString()
    {
        return "Passport [passportNO=" + passportNO + ", passportType=" + passportType + "]";
    }    
}

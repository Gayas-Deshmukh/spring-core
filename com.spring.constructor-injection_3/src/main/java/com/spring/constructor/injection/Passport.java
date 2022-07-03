package com.spring.constructor.injection;

import java.util.*;

public class Passport
{
    private int                 passportNO;
    private String              passportType;
    private List                countryList;
    private Set                 countryCode;
    private Map<Integer,String> fightInfo;
    private Properties          additionalInfo;
    private Customer            customer;
    
    public Passport(int passportNO, String passportType, List countryList, Set countryCode, Map<Integer, String> fightInfo, Properties additionalInfo,
            Customer customer)
    {
        super();
        this.passportNO = passportNO;
        this.passportType = passportType;
        this.countryList = countryList;
        this.countryCode = countryCode;
        this.fightInfo = fightInfo;
        this.additionalInfo = additionalInfo;
        this.customer = customer;
    }

    @Override
    public String toString()
    {
        return "Passport [passportNO=" + passportNO + ", passportType=" + passportType + ", countryList=" + countryList + ", countryCode=" + countryCode
                + ", fightInfo=" + fightInfo + ", additionalInfo=" + additionalInfo + ", customer=" + customer + "]";
    }
}

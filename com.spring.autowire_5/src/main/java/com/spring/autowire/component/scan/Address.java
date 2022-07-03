package com.spring.autowire.component.scan;

import org.springframework.stereotype.Component;

@Component
public class Address
{
    private String addressName = "Pune";
    private String addressState;
    
    public String getAddressName()
    {
        return addressName;
    }
    public void setAddressName(String addressName)
    {
        this.addressName = addressName;
    }
    public String getAddressState()
    {
        return addressState;
    }
    public void setAddressState(String addressState)
    {
        this.addressState = addressState;
    }
    
    public Address()
    {
        super();
        System.out.println("Address Constructor executed...");
    }
    
    @Override
    public String toString()
    {
        return "Addess [addressName=" + addressName + ", addressState=" + addressState + "]";
    }
      
}

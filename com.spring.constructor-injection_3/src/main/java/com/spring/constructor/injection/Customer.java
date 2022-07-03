package com.spring.constructor.injection;

public class Customer
{
    private int     customerId;
    private String  customerName;
    private String  city;
  
  /*
   * For -> Setter Injection
    public int getCustomerId()
    {
        return customerId;
    }
    public void setCustomerId(int customerId)
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
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    */
   
    // For Constructor Injection
    public Customer(int customerId, String customerName, String city)
    {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.city = city;
    } 
    
    @Override
    public String toString()
    {
        return "Cutomer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city + "]";
    }  
}

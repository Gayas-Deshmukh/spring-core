package com.spring.spring.bean.singleton.scope;

import org.springframework.stereotype.Component;

@Component
public class Product
{
    private int productId;
    private String productName;
    
    public int getProductId()
    {
        return productId;
    }
    public void setProductId(int productId)
    {
        this.productId = productId;
    }
    public String getProductName()
    {
        return productName;
    }
    public void setProductName(String productName)
    {
        this.productName = productName;
    }
    
    
}

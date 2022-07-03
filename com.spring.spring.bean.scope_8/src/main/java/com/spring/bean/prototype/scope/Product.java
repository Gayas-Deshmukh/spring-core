package com.spring.bean.prototype.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName =  ConfigurableBeanFactory.SCOPE_PROTOTYPE )
public class Product
{
   /* 
    * Injecting Prototype Scope bean into Singleton Scope bean
    * 
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
    
    ======================================================================================
    
    */
    
    /*
     * Injecting Singleton Scope bean into Prototype Scope bean
     */
    private int productId;
    private String productName;
    
    @Autowired
    private Order order;
    
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
    public Order getOrder()
    {
        return order;
    }
    public void setOrder(Order order)
    {
        this.order = order;
    }
    
    
    
}

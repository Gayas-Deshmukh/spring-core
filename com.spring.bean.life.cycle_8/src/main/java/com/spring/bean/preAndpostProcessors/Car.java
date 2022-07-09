package com.spring.bean.preAndpostProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Car implements BeanPostProcessor
{
    
    public Car()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("Called Before Initialization");
        return null;
    }
    
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("Called after Initialization");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
    
    public void inIt()
    {
        System.out.println("inIt Method Called");
    }
}

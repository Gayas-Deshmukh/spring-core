package com.spring.constructor.injection.ambiguty.problem;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{
   public static void main(String[] args)
   {
       Resource resource   =   new ClassPathResource("constructor-injection-ambiguty.xml");
       
       BeanFactory factory =   new XmlBeanFactory(resource);
       
       Addition add    =   factory.getBean(Addition.class);
       
       add.doSum();
   }
}

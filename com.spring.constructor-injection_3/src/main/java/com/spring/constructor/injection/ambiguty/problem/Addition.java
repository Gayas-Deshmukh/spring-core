package com.spring.constructor.injection.ambiguty.problem;

public class Addition
{
    private int a;
    private int b;
    
    public Addition(double a , double b)
    {
        this.a = (int) a;
        this.b = (int) b;
        
        System.out.println("Double type constructor called ...");
    }
    
    public Addition(int a , int b)
    {
        this.a = a;
        this.b = b;
        
        System.out.println("Int type constructor called ...");
    }
    
    public Addition(String a , String b)
    {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        
        System.out.println("String type constructor called ...");
    }
    
    public void doSum()
    {
        System.out.println("Value of a :" + this.a);
        System.out.println("Value of b :" + this.b);
        System.out.println("Addition :" + (this.a + this.b));
    }
}

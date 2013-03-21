/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uvaldez.tutorials.basic.exception;

/**
 *
 * @author ujvaldez
 */
public abstract class Animal {
    
    private String name;
    
    public Animal(String str)
    {
        name=str;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void eat()
    {
        System.out.println("The "+name+" is eating...");
    }
    
    public void sleep()
    {
        System.out.println("The "+name+" is sleeping...");
    }    
    
    public abstract void doTrick();
}

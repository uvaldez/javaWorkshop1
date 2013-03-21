/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uvaldez.tutorials.basic.exception;

/**
 *
 * @author ujvaldez
 */
public class Cat extends Animal implements iPettable{
    
    public Cat(String str)
    {
        super(str);
    }
    
    public void doTrick()
    {
        System.out.println(getName()+ " watching window");
    }    
    
    public void pet()
    {
        System.out.println(getName()+ " i'm pet");
    }
}

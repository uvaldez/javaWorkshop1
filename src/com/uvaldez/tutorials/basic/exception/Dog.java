/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uvaldez.tutorials.basic.exception;

/**
 *
 * @author ujvaldez
 */
public class Dog extends Animal implements iPettable{
    
    public Dog (String str)
    {
        //with super we will pass the paramter to Animal class, this has to be here because Animal's constructor needs a parameter
        super(str);
    }

    public void doTrick()
    {
        System.out.println(getName()+ " Playing dead");
    }
    
    public void pet()
    {
        System.out.println(getName()+ " i'm pet");
    }
}

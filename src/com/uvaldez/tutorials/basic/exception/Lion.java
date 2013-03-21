/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uvaldez.tutorials.basic.exception;

/**
 *
 * @author ujvaldez
 */
public class Lion extends Animal{
    
    public Lion (String str)
    {
        super(str);
    }    
    
    public void doTrick()
    {
        System.out.println(" you have been eating by "+getName());
    }
    
}

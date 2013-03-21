/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uvaldez.tutorials.basic.exception;

/**
 *
 * @author ujvaldez
 */
public class AppStart {
      public static void main(String[] args){
          
          //Working with Exeptions:
          try{
            for(int i=0;i<args.length;i++)
            {
                System.out.println(args[i]);
                int sumfive = 5;
                System.out.println("Sum = " +Integer.parseInt(args[i])+sumfive);
            }              
          }
          catch(Exception e)
          {
              System.out.println(e.getMessage());
          }
          //finish working with exceptions
          
          //Working with extended class
          //Dog d = new Dog("Hitler");
          //Cat c = new Cat("Monalisa");
          Animal d = new Dog("Hitler");
          Animal c = new Cat("Monalisa");          
          
          Animal l = new Lion("Cesar");
          d.sleep();
          c.eat();
          
          d.doTrick();
          c.doTrick();
          l.doTrick();
          
          //TypeCasting
          ((iPettable) d).pet();
      }
}

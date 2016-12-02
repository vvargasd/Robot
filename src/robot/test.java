/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Vladimir
 */
public class test extends Thread{
    
     private Turtle turtle;
     
     public test(Turtle turtle){
         this.turtle = turtle;
         
     }
     
      public void run(){
        xy(turtle);
         // circle(turtle);
    }

    private void xy(Turtle turtle) {
        turtle.forward(200);
        turtle.right(180);
        turtle.forward(400);
        turtle.right(180);
        turtle.forward(200);
        turtle.right(90);
        turtle.forward(200);
        turtle.right(180);
        turtle.forward(400);
    }
    
    public void circle(Turtle t){
        for(int i = 0; i < 360; i++){
            t.forward(0.2);
            t.right(1);
            t.hideTurtle();
        }
            
    }
}

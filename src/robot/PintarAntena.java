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
public class PintarAntena extends Thread{

    private Turtle turtle;
    
    public PintarAntena(Turtle turtle) {
        this.turtle = turtle;
        turtle.hideTurtle();
    }
    
    public void pintarAntena(Turtle turtle){
         turtle.forward(30);
         turtle.right(90);
         turtle.forward(6);
         turtle.right(90);
         turtle.forward(30);
         turtle.setH(0);         
         turtle.forward(30);
         turtle.setH(250);
          for(int i = 0; i < 360; i+=5){
               turtle.forward(0.6);
               turtle.right(5);       
        }
    }

    
    public void run() {
        pintarAntena(turtle);
    }
    
    
    
    
    
}

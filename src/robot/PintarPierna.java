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
public class PintarPierna extends Thread{

    private Turtle turtle;
    public PintarPierna(Turtle turtle) {
        this.turtle = turtle;
    }
    
    public void pintarPierna(Turtle turtle){
        
        turtle.setH(90);
        turtle.right(90);
        turtle.forward(80);
        turtle.right(90);
        turtle.forward(16);
        turtle.right(90);        
        turtle.forward(80);
        turtle.right(90);
        turtle.forward(16);
        turtle.right(90);
        turtle.forward(80);
        
        turtle.forward(20);
        turtle.right(90);
        turtle.forward(50);
        turtle.right(155);
        turtle.forward(55);
        
        turtle.setPos(30, -53);
        turtle.setH(270);        
        turtle.left(90);
        turtle.forward(80);
        turtle.left(90);
        turtle.forward(16);
        turtle.left(90);        
        turtle.forward(80);
        turtle.left(90);
        turtle.forward(16);
        turtle.left(90);
        turtle.forward(80);
        
        turtle.forward(20);
        turtle.left(90);
        turtle.forward(50);
        turtle.left(155);
        turtle.forward(55);
        
    }
    
    
    public void run(){
        
        pintarPierna(turtle);
        
    }
    
    
}

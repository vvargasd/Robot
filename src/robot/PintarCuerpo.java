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
public class PintarCuerpo extends Thread{

    private Turtle turtle;
    public PintarCuerpo(Turtle turtle) {
        this.turtle = turtle;
    }
    
    public void pintarCuerpo(Turtle turtle){
         turtle.forward(120);
         turtle.right(90);
         turtle.forward(120);
         turtle.right(90);
         turtle.forward(120);
         turtle.right(90);
         turtle.forward(120);
         
    }
    
    public void pintarCentro(Turtle turtle){
        turtle.setPos(-50, 30);         
         turtle.setH(0);
         turtle.forward(25);
         turtle.right(90);
         turtle.forward(100);
         turtle.right(90);
         turtle.forward(25);
         turtle.right(90);
         turtle.forward(100);
    }
    
    public void triangulos(Turtle turtle){
        turtle.setH(0);
        turtle.setPos(-45,35);
        turtle.right(30);
        turtle.forward(15);
        turtle.right(120);
        turtle.forward(15);
        turtle.right(120);
        turtle.forward(15);
        
        turtle.setH(0);
        turtle.setPos(-20,35);
        turtle.right(30);
        turtle.forward(15);
        turtle.right(120);
        turtle.forward(15);
        turtle.right(120);
        turtle.forward(15);
        
        turtle.setH(0);
        turtle.setPos(5,35);
        turtle.right(30);
        turtle.forward(15);
        turtle.right(120);
        turtle.forward(15);
        turtle.right(120);
        turtle.forward(15);
        
        turtle.setH(0);
        turtle.setPos(30,35);
        turtle.right(30);
        turtle.forward(15);
        turtle.right(120);
        turtle.forward(15);
        turtle.right(120);
        turtle.forward(15);
    }
    
    public void pintarCirculos(Turtle turtle){
        
        turtle.setH(90);
        turtle.setPos(-30,-30);
        for(int i = 0; i < 360; i+=5){
               turtle.forward(0.6);
               turtle.right(5);       
        }
        
        turtle.setH(90);
        turtle.setPos(0,-30);
        for(int i = 0; i < 360; i+=5){
               turtle.forward(0.6);
               turtle.right(5);       
        }       
        
        turtle.setH(90);
        turtle.setPos(30,-30);
        for(int i = 0; i < 360; i+=5){
               turtle.forward(0.6);
               turtle.right(5);       
        }
    }
    
    
    
    public void run(){
        pintarCuerpo(turtle);
        pintarCentro(turtle);
        triangulos(turtle);
        pintarCirculos(turtle);
        
    }
    
    
    
}

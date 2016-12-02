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
public class PintarBrazo extends Thread{

    private Turtle turtle;
    public PintarBrazo(Turtle turtle) {
        this.turtle = turtle;
        turtle.hideTurtle();
    }   
    
    public void pintarHombro(Turtle turtle){
         turtle.setH(270);
         turtle.forward(10);
         turtle.right(90);
         turtle.forward(5);
         turtle.right(90);
         turtle.forward(10);
         turtle.right(90);
         turtle.forward(5);
          turtle.right(90);
         turtle.forward(10);
         turtle.setH(200);
         for(int i = 0; i < 360; i+=5){
            turtle.forward(1.1);
            turtle.right(5);            
        }         
         
        turtle.setPos(-75,56);
        for(int i = 0; i < 360; i+=5){
               turtle.forward(0.6);
               turtle.right(5);       
        }
        
        
    }
    
    public void pintarHombroD(Turtle turtle){
        turtle.setPos(60,55);
        turtle.setH(90);        
         turtle.forward(10);
         turtle.left(90);
         turtle.forward(5);
         turtle.left(90);
         turtle.forward(10);
         turtle.left(90);
         turtle.forward(5);
          turtle.left(90);
         turtle.forward(10);
         turtle.setH(0);
         for(int i = 0; i < 360; i+=5){
            turtle.forward(1.1);
            turtle.right(5);            
        }         
         
        turtle.setPos(75,56);
        for(int i = 0; i < 360; i+=5){
               turtle.forward(0.6);
               turtle.right(5);       
        }
    }
    
    public void brazo(Turtle turtle){
        turtle.setPos(-76,43);
        turtle.setH(270);
        turtle.forward(10);
        turtle.right(90);
        turtle.forward(3);
        turtle.right(90);
        turtle.forward(10);
        turtle.right(90);
        turtle.forward(3);
        turtle.right(90);
        turtle.forward(10);
        
        turtle.forward(3);
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
        
        
    }
    
    public void pintarBrazoD(Turtle turtle){
        turtle.setPos(76,43);
        turtle.setH(90);
        turtle.forward(10);
        turtle.left(90);
        turtle.forward(3);
        turtle.left(90);
        turtle.forward(10);
        turtle.left(90);
        turtle.forward(3);
        turtle.left(90);
        turtle.forward(10);
        
        turtle.forward(3);
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
    }
         
    public void pintarMano(Turtle turtle){
       
         turtle.left(90);
         turtle.forward(10);
         turtle.right(90);
         turtle.forward(8);
         turtle.right(90);
         turtle.forward(5);
         turtle.right(90);
         turtle.forward(8);
         turtle.right(90);
         turtle.forward(5);
          turtle.right(90);
         turtle.forward(8);         
       turtle.setH(120);
        for(int i = 0; i < 360; i+=5){
               turtle.forward(0.6);
               turtle.right(5);       
        }
        
        turtle.setH(0);
        turtle.setPos(-95, -75);
        turtle.forward(18);
         turtle.right(90);
         turtle.forward(8);
         turtle.right(90);
         turtle.forward(18);
         turtle.right(90);
         turtle.forward(8);
         
         turtle.setH(0);
        turtle.setPos(-75, -75);
        turtle.forward(18);
         turtle.right(90);
         turtle.forward(8);
         turtle.right(90);
         turtle.forward(18);
         turtle.right(90);
         turtle.forward(8);
        
    }
    
    public void pintarManoD(Turtle turtle){
        turtle.right(90);
         turtle.forward(10);
         turtle.left(90);
         turtle.forward(8);
         turtle.left(90);
         turtle.forward(5);
         turtle.left(90);
         turtle.forward(8);
         turtle.left(90);
         turtle.forward(5);
          turtle.left(90);
         turtle.forward(8);         
       turtle.setH(60);
        for(int i = 0; i < 360; i+=5){
               turtle.forward(0.6);
               turtle.right(5);       
        }
        
        turtle.setH(0);
        turtle.setPos(85, -75);
        turtle.forward(18);
         turtle.right(90);
         turtle.forward(8);
         turtle.right(90);
         turtle.forward(18);
         turtle.right(90);
         turtle.forward(8);
         
         turtle.setH(0);
        turtle.setPos(70, -75);
        turtle.forward(18);
         turtle.right(90);
         turtle.forward(8);
         turtle.right(90);
         turtle.forward(18);
         turtle.right(90);
         turtle.forward(8);
    }
    
    public void run(){
        pintarHombro(turtle);
        brazo(turtle);
        pintarMano(turtle);
        pintarHombroD(turtle);
        pintarBrazoD(turtle);
        pintarManoD(turtle);
    }
    
    
}

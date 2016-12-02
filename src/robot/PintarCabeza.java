/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot;

import ch.aplu.turtle.Turtle;
import java.awt.Color;

/**
 *
 * @author Vladimir
 */
public class PintarCabeza extends Thread{
    
    private Turtle turtle;

    public PintarCabeza(Turtle turtle) {
        this.turtle = turtle;
        turtle.setColor(Color.yellow);
        //turtle.hideTurtle();
    }
    
    public void run(){
        cabeza(turtle);
        ojos(turtle);
        boca(turtle);
        cuello(turtle);
    }
    
    public void cuello(Turtle turtle){
         turtle.setPos(-30, 67);
         turtle.setH(0);
         turtle.forward(13);
         turtle.right(90);
         turtle.forward(60);
         turtle.right(90);
         turtle.forward(13);
         turtle.right(90);
         turtle.forward(60);
    }
    
    public void cabeza(Turtle turtle){
         turtle.forward(50);
         turtle.right(90);
         turtle.forward(90);
         turtle.right(90);
         turtle.forward(50);
         turtle.right(90);
         turtle.forward(90);
         
    }
    
    public void boca(Turtle turtle){
         turtle.penDown();
         turtle.setPos(-24, 90);
         turtle.setH(0);
         turtle.forward(10);
         turtle.right(90);
         turtle.forward(48);
         turtle.right(90);
         turtle.forward(10);
         turtle.right(90);
         turtle.forward(48);
         turtle.setH(0);
         turtle.forward(10);
         turtle.right(90);
         turtle.forward(12);
         turtle.right(90);
         turtle.forward(10);
         turtle.left(90);
         turtle.forward(12);
         turtle.left(90);
         turtle.forward(10);
         turtle.right(90);
         turtle.forward(12);
         turtle.right(90);
          turtle.forward(10);
    }
    
    public void ojos(Turtle turtle){
        turtle.setPos(-20, 105);
        for(int i = 0; i < 360; i+=5){
            turtle.forward(0.8);
            turtle.right(5);            
        }
         turtle.setPos(20, 105);
        for(int i = 0; i < 360; i+=5){
            turtle.forward(0.8);
            turtle.right(5);            
        }
        turtle.setPos(-20, 108);
        //turtle.penUp();
        for(int i = 0; i < 360; i+=5){
            if(i >= 120 && i <= 240)
                turtle.penDown();
            else
                turtle.penUp();
               turtle.forward(0.4);
               turtle.right(5);       
        }
        
         turtle.setPos(20, 108);
        for(int i = 0; i < 360; i+=5){
            if(i >= 120 && i <= 240)
                turtle.penDown();
            else
                turtle.penUp();
               turtle.forward(0.4);
               turtle.right(5);          
        }        
    }
   
}

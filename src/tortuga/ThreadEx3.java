package tortuga;

//ThreadEx3.java

import ch.aplu.turtle.*;
import java.awt.Color;

public class ThreadEx3 extends TurtleFrame
{
    public void simular(){
        Turtle hilo1 = new Turtle(this);
        Turtle hilo2 = new Turtle(this, Color.red);
        Turtle hilo3 = new Turtle(this, Color.green);
                
        hilo1.setPos(-135, -50);
        hilo2.setPos(-10, -50);
        hilo3.setPos(115, -50);
        hilo1.setPenColor(Color.red);
        hilo2.setPenColor(Color.green);
        
        new Cuadrado(hilo1).start();
        new Cuadrado(hilo2).start();
        new Linea(hilo3).start();
    }


public static void main(String[] args)
{
   ThreadEx3 tablero =  new ThreadEx3();
   tablero.simular();
}
}
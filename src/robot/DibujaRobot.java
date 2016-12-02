/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;

/**
 *
 * @author Vladimir
 */
public class DibujaRobot extends TurtleFrame{
    
    public void dibujarRobot(){
          Turtle hilo1 = new Turtle(this);
          Turtle hilo2 = new Turtle(this);
          Turtle hilo3 = new Turtle(this);
          Turtle hilo4 = new Turtle(this);
          Turtle hilo5 = new Turtle(this);
          hilo1.setPos(-45, 80);
          hilo2.setPos(-60, -53);
          hilo3.setPos(-30, -53);
          hilo4.setPos(-60, 55);
          hilo5.setPos(-3, 130);
          
          Turtle xy = new Turtle(this);
          
          new PintarCabeza(hilo1).start();
          new PintarCuerpo(hilo2).start();
          new PintarPierna(hilo3).start();
          new PintarBrazo(hilo4).start();
          new PintarAntena(hilo5).start();
          new test(xy).start();
    }
    
    public static void main(String[] args) {
        DibujaRobot dr = new DibujaRobot();
        dr.dibujarRobot();
    }
}

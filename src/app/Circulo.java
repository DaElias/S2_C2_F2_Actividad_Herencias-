/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Graphics;

/**
 *
 * @author iTzSumer
 */
public class Circulo extends Figuras {

    public Circulo(int r, Puntos x) {
        this.altura = r; //radio
        this.ancho = 0;
        this.Pinicial = x;
    }

    @Override
    public float area() {
        super.area(); //To change body of generated methods, choose Tools | Templates.
        return (float) (altura * 3.14159265359 * altura);
    }

    @Override
    public float perimetro() {
        super.perimetro(); //To change body of generated methods, choose Tools | Templates.
        return (float) (2 * altura * 3.14159265359);
    }

    @Override
    public void draw(Graphics a) {
        super.draw(a); //To change body of generated methods, choose Tools | Templates.
        a.drawOval(Pinicial.getX(),Pinicial.getY(),altura,altura);
    }
    
    
}

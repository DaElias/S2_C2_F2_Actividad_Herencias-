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
public class Cuadrado extends Figuras {

    public Cuadrado(int a, int b, Puntos x) {
        this.altura = a;
        this.ancho = b;
        this.Pinicial = x;
    }

    @Override
    public float area() {
        super.area(); //To change body of generated methods, choose Tools | Templates.
        return altura * ancho;
    }

    @Override
    public float perimetro() {
        super.perimetro(); //To change body of generated methods, choose Tools | Templates.
        return 2 * (altura + ancho);
    }

    @Override
    public void draw(Graphics a) {
        super.draw(a); //To change body of generated methods, choose Tools | Templates.
        a.drawRect(Pinicial.getX(), Pinicial.getY(), altura, ancho);
    }

}

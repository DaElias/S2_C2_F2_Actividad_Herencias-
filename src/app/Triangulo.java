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
public class Triangulo extends Figuras {

    public Triangulo(int alto, int base, Puntos p) {
        this.altura = alto;
        this.ancho = base;
        this.Pinicial = p;
    }

    @Override
    public float area() {
        super.area(); //To change body of generated methods, choose Tools | Templates.
        return (ancho * altura) / 2;
    }

    @Override
    public float perimetro() {
        super.perimetro(); //To change body of generated methods, choose Tools | Templates.
        float hipotenusa;
        hipotenusa = (float) Math.hypot(Math.pow((ancho / 2), 2), Math.pow(altura, 2));
        return (ancho) + (hipotenusa * 2);
    }

    @Override
    public void draw(Graphics a) {
        super.draw(a); //To change body of generated methods, choose Tools | Templates.
        a.drawLine(this.Pinicial.getX(), this.Pinicial.getY(), this.Pinicial.getX() + (this.ancho / 2), this.Pinicial.getY() + this.altura);
        a.drawLine(this.Pinicial.getX() + (this.ancho / 2), this.Pinicial.getY() + this.altura, this.Pinicial.getX() - (this.ancho / 2), this.Pinicial.getY() + this.altura);
        a.drawLine(this.Pinicial.getX(), this.Pinicial.getY(), this.Pinicial.getX() - (this.ancho / 2), this.Pinicial.getY() + this.altura);
    }

}

package org.acme;

public class Circulo {
    
    private double area;
    private double radius;

    public Circulo(double area, double radius){
        this.area = area;
        this.radius=radius;
    }

    public void setArea(double area){
        this.area = area;
    }

    public double getArea(){
        return this.area;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return this.radius;
    }
}

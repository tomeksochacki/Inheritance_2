package com.example.inheritance.shapes;

public class Circle extends AbstractShape{
    private double radius;

    public Circle(EColor eColor, double radius){
        super(eColor);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getDiameter(){
        return 2*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public double getSurface(){
        return Math.PI*radius*radius;
    }

    public String toString(){
        return "Circle: radius= " + radius + ", color= " + eColor;
    }

}

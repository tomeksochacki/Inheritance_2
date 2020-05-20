package com.example.inheritance.shapes;

public abstract class AbstractShape {
    protected EColor eColor;

    public AbstractShape(EColor eColor){
        this.eColor = eColor;
    }

    public EColor getColor(){
        return eColor;
    }

    public void setColor(EColor eColor){
        this.eColor = eColor;
    }

    public abstract double getPerimeter();
    public abstract double getSurface();

}

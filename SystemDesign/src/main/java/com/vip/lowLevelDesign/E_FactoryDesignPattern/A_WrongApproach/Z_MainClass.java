package com.vip.lowLevelDesign.E_FactoryDesignPattern.A_WrongApproach;

import com.vip.lowLevelDesign.E_FactoryDesignPattern.A_WrongApproach.shape.Circle;
import com.vip.lowLevelDesign.E_FactoryDesignPattern.A_WrongApproach.shape.Rectangle;
import com.vip.lowLevelDesign.E_FactoryDesignPattern.A_WrongApproach.shape.Shape;

public class Z_MainClass {
    public static void main(String[] args) {
        Shape shape=null;
        String typeOfShape;

        // suppose we want to use circle shape
        typeOfShape="circle";

        if(typeOfShape.equalsIgnoreCase("circle")){
            shape=new Circle();
        }
        if(typeOfShape.equalsIgnoreCase("rectangle")){
            shape=new Rectangle();
        }
        shape.draw();







    }
}

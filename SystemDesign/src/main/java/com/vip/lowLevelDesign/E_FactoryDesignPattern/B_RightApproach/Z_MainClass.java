package com.vip.lowLevelDesign.E_FactoryDesignPattern.B_RightApproach;

import com.vip.lowLevelDesign.E_FactoryDesignPattern.B_RightApproach.factory.ShapeFactory;
import com.vip.lowLevelDesign.E_FactoryDesignPattern.B_RightApproach.shape.Circle;
import com.vip.lowLevelDesign.E_FactoryDesignPattern.B_RightApproach.shape.Rectangle;
import com.vip.lowLevelDesign.E_FactoryDesignPattern.B_RightApproach.shape.Shape;

public class Z_MainClass {
    public static void main(String[] args) {

//        String typeOfObj="Circle";
          String typeOfObj="rectangle";
        ShapeFactory shapeFactory= new ShapeFactory();
        Shape shape = shapeFactory.getObject(typeOfObj);

        shape.draw();


    }
}

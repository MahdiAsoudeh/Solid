package com.mahdi20.OpenClosePrinciple;


import com.mahdi20.OpenClosePrinciple.AreaCalculator;
import com.mahdi20.OpenClosePrinciple.Circle;
import com.mahdi20.OpenClosePrinciple.Rectangle;

public class MainApplication {

    public static void main(String[] args) {

        openCloaseExample();

    }

    // open-close example
    private static void openCloaseExample() {
        AreaCalculator areaCalculator = new AreaCalculator();
        double shape1 = areaCalculator.calculateShapeArea(new Circle(5));
        System.out.println("shape1: " + shape1);
        double shape2 = areaCalculator.calculateShapeArea(new Rectangle(3, 5));
        System.out.println("shape2: " + shape2);
    }
}

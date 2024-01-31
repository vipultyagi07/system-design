package com.vip.decoratorClasses;

import com.vip.NormalPizza.BasePizza;
import com.vip.decoratorClasses.impl.ExtraCheese;
import com.vip.decoratorClasses.impl.Mushroom;

public class ToppingFactory {

    public static ToppingDecorator createTopping(String topping, BasePizza pizza) {
        switch (topping.toLowerCase()) {
            case "mushroom":
                return new Mushroom(pizza);
            case "extracheese":
                return new ExtraCheese(pizza);
            // Add more toppings as needed
            default:
                return null;
        }
    }
}
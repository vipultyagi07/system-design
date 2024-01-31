package com.vip.lowLevelDesign.D_DecoratorDesignPattern.pizzaSelectionSystem;

import com.vip.lowLevelDesign.D_DecoratorDesignPattern.pizzaSelectionSystem.NormalPizza.BasePizza;
import com.vip.lowLevelDesign.D_DecoratorDesignPattern.pizzaSelectionSystem.NormalPizza.Margherita;
import com.vip.lowLevelDesign.D_DecoratorDesignPattern.pizzaSelectionSystem.decoratorClasses.impl.ExtraCheese;
import com.vip.lowLevelDesign.D_DecoratorDesignPattern.pizzaSelectionSystem.decoratorClasses.impl.Mushroom;

public class TestClass {

    public static void main(String[] args) {

        // first use case : margherita + ExtraCheese

        Margherita margherita = new Margherita();
        BasePizza margCheesePizza = new ExtraCheese(margherita);
        System.out.println("The cost of margherita Cheese Pizza: "+margCheesePizza.cost());

        // second use case : margherita + ExtraCheese + Mushroom

        Margherita margheritaa = new Margherita();
        BasePizza marghCheesePizza = new ExtraCheese(margherita);
        BasePizza margCheeseMushroomPizza = new Mushroom(marghCheesePizza);
        System.out.println("The cost of margherita Cheese Mushroom Pizza: "+margCheeseMushroomPizza.cost());


    }
}

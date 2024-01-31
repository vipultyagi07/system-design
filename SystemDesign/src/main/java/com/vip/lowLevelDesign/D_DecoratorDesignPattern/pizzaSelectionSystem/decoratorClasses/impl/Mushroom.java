package com.vip.lowLevelDesign.D_DecoratorDesignPattern.pizzaSelectionSystem.decoratorClasses.impl;

import com.vip.lowLevelDesign.D_DecoratorDesignPattern.pizzaSelectionSystem.NormalPizza.BasePizza;
import com.vip.lowLevelDesign.D_DecoratorDesignPattern.pizzaSelectionSystem.decoratorClasses.ToppingDecorator;

public class Mushroom extends ToppingDecorator {
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+15;
    }
}

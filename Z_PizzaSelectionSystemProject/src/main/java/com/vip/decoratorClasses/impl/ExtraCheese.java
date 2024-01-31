package com.vip.decoratorClasses.impl;

import com.vip.NormalPizza.BasePizza;
import com.vip.decoratorClasses.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}

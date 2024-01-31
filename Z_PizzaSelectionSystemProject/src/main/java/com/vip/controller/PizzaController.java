package com.vip.controller;

import com.vip.NormalPizza.BasePizza;
import com.vip.PizzaService;
import com.vip.decoratorClasses.ToppingDecorator;
import com.vip.decoratorClasses.ToppingFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/api/pizza")
    public int getPizzaCost(
            @RequestParam(name = "basePizza", required = true) String type,
            @RequestParam(name = "toppings", required = false) List<String> toppings
    ) {
        BasePizza pizza = pizzaService.getPizza(type);

        if (toppings != null) {
            for (String topping : toppings) {
                pizza = addTopping(pizza, topping);
            }
        }

        return pizza.cost();
    }

    private BasePizza addTopping(BasePizza pizza, String topping) {
        // Assume you have a ToppingFactory to create instances dynamically
        ToppingDecorator toppingDecorator = ToppingFactory.createTopping(topping, pizza);
        return toppingDecorator != null ? toppingDecorator : pizza;
    }
}
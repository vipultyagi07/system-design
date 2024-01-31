package com.vip;

import com.vip.NormalPizza.BasePizza;
import com.vip.NormalPizza.FarmHouse;
import com.vip.NormalPizza.Margherita;
import com.vip.NormalPizza.VegDelight;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

    public BasePizza getPizza(String type) {
        switch (type.toLowerCase()) {
            case "farmhouse":
                return new FarmHouse();
            case "margherita":
                return new Margherita();
            case "vegdelight":
                return new VegDelight();
            default:
                throw new IllegalArgumentException("Invalid pizza type");
        }
    }
}
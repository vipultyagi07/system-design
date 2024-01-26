    package com.vip.lowLevelDesign.A_SOLID_Principles.E_DependencyInversionPrinciple.A_wrongApproach;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Component;

    @Component
    public class Laptop {

        @Autowired
        private Keyboard keyboard;

        @Autowired
        private Mouse mouse;

        public Laptop(Keyboard keyboard, Mouse mouse) {
            this.keyboard = keyboard;
            this.mouse = mouse;
        }
    }


    @Component
     class Keyboard {
    }

    @Component
    class Mouse {


    }

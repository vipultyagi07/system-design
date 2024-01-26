package com.vip.lowLevelDesign.A_SOLID_Principles.E_DependencyInversionPrinciple.B_rightApproach;

// Abstraction for Keyboard
 interface Keyboard {
    void type();
}

// Abstraction for Mouse
 interface Mouse {
    void click();
}

// High-level module representing a Laptop
public class Laptop {
    private Keyboard keyboard;
    private Mouse mouse;

    public Laptop(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void useExternalDevices() {
        keyboard.type();
        mouse.click();
    }
}

// Low-level module for a Bluetooth Keyboard
 class BluetoothKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing with Bluetooth Keyboard");
    }
}

// Low-level module for a Wired Keyboard
 class WiredKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing with Wired Keyboard");
    }
}

// Low-level module for a Bluetooth Mouse
 class BluetoothMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Clicking with Bluetooth Mouse");
    }
}

// Low-level module for a Wired Mouse
 class WiredMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Clicking with Wired Mouse");
    }
}


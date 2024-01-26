package com.vip.lowLevelDesign.A_SOLID_Principles.E_DependencyInversionPrinciple.B_rightApproach;

public class Main {
    public static void main(String[] args) {
        // Creating instances of low-level modules
        Keyboard bluetoothKeyboard = new BluetoothKeyboard();
        Mouse wiredMouse = new WiredMouse();

        // Creating an instance of high-level module
        Laptop laptop = new Laptop(bluetoothKeyboard, wiredMouse);

        // Using external devices through the laptop
        laptop.useExternalDevices();
    }
}

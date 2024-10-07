package org.example;

public class DieselEngine implements IEngine{

    DieselEngine()
    {
        System.out.println("Diesel Engine constructor....");
    }

    public int start() {
        System.out.println("DieselEngine engine started....");
        return 1;
    }
}

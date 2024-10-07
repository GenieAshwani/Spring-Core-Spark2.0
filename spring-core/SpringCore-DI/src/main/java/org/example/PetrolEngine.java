package org.example;

public class PetrolEngine implements IEngine{

    PetrolEngine()
    {
        System.out.println("petrol engine constructor....");
    }

    public int start() {
        System.out.println("petrol engine started....");
        return 1;
    }
}

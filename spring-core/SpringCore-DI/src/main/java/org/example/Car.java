package org.example;

public class Car {
    IEngine engine;

    Car()
    {
        System.out.println("car constructor....");
    }

    Car(IEngine engine)
    {
        System.out.println("car parameter constructor....");
        this.engine=engine;
    }

    //target object

    public void setEngine(IEngine engine) {
        System.out.println("calling setter method...");
        this.engine = engine;
    }

    void drive()
    {
        int start = engine.start();
        if(start>0)
        {
            System.out.println("Car started....");
        }
        else {
            System.out.println("Car not started...");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

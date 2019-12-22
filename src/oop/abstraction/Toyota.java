package oop.abstraction;

public class Toyota extends MotorEngine implements Car {

    public void bodyShape() {
        System.out.println("Car must be below 6 feet");

    }


    public void start() {
        System.out.println("must have engine run by gasoline");

    }


    public void stop() {
        System.out.println("must stop the any time needed");
    }

    // if we want we can add more features or methods in this class
    public void autoStart() {
        System.out.println("Car must auto start in case of emergency");
    }


    public void electricEngine() {
        // simply write in the body
        System.out.println("The engin should be good");

    }
    // public abstract  void electricEngine();
}


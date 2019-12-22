package oop.abstraction;

public class TestCar {

    public static void main(String[] args) {

        Car car = new Toyota();
        car.bodyShape();
        Toyota corrolla = new Toyota();
        corrolla.autoStart();

        MotorEngine motorEngine = new Toyota();
        motorEngine.hybrideEngine();


        }
    }


package chapter03.ch10;

public abstract class Car {
    public abstract void drive();

    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 겁니다.");
    }

    public void stopCar() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}

    final public void run() {
        startCar();
        drive();
        stop();
        stopCar();
        washCar();
    }
}

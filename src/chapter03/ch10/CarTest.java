package chapter03.ch10;

public class CarTest {
    public static void main(String[] args) {
        AICar ai = new AICar();
        ai.run();

        System.out.println("==========================");

        ManualCar manual = new ManualCar();
        manual.run();
    }
}

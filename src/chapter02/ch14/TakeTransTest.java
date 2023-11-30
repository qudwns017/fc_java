package chapter02.ch14;

public class TakeTransTest {
    public static void main(String[] args) {
        Student james = new Student("James", 10000);
        Student tomas = new Student("Tomas", 20000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        james.takeBus(bus100);

        Subway greenSubway = new Subway(2);
        Subway purpleSubway = new Subway(5);

        tomas.takeSubway(greenSubway);

        james.showInfo();
        tomas.showInfo();

        bus100.showBusInfo();
        greenSubway.showBusInfo();

        bus500.showBusInfo();
    }
}

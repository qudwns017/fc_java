package chapter02.ch15;

public class Taxi {
    String name;
    int money;
    int passengerCount;

    public Taxi(String name) {
        this.name = name;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showTaxiInfo() {
        System.out.println(name + "수입은 " + money + "원이고, 승객 수는 " + passengerCount +"명 입니다.");
    }
}

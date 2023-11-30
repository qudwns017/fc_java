package chapter02.ch15;

public class Person {
    String name;
    int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi, int money) {
        this.money -= money;
        taxi.take(money);
    }

    public void showPersonInfo() {
        System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
    }
}

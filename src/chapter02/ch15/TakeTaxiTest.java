package chapter02.ch15;

public class TakeTaxiTest {
    public static void main(String[] args) {
        Person edward = new Person("Edward", 20000);
        Taxi wellTaxi = new Taxi("잘나간다 운수");

        edward.takeTaxi(wellTaxi, 10000);
        edward.showPersonInfo();
        wellTaxi.showTaxiInfo();
    }
}

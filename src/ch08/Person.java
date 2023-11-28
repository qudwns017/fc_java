package ch08;

public class Person {
    private int height;
    private int weight;
    private int age;
    private String name;
    private String sex;

    public Person(String name, String sex, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.sex = sex;
    }

    public String getPersonInfo() {
        return "키가 " + height + " 이고 몸무게가 " + weight + " 킬로인 " + sex + "이 있습니다. 이름은 " + name + " 이고 나이는 " + age
                + "세입니다.";
    }
}

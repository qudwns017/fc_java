package chapter03.ch16.gamelevel.level;

import chapter03.ch16.gamelevel.PlayerLevel;

public class BeginnerLevel extends PlayerLevel {
    @Override
    protected void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    protected void jump() {
        System.out.println("Jump 못하지롱 ㅋㅋ");
    }

    @Override
    protected void turn() {
        System.out.println("Turn 못하지롱 ㅋㅋ");
    }

    @Override
    protected void showLevelMessage() {
        System.out.println("****** 초급자 레벨입니다. ******");
    }
}

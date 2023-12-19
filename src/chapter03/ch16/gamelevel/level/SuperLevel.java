package chapter03.ch16.gamelevel.level;

import chapter03.ch16.gamelevel.PlayerLevel;

public class SuperLevel extends PlayerLevel {
    @Override
    protected void run() {
        System.out.println("겁나 빨리 달립니다.");
    }

    @Override
    protected void jump() {
        System.out.println("겁나 높이 Jump 합니다.");
    }

    @Override
    protected void turn() {
        System.out.println("Turn 합니다.");
    }

    @Override
    protected void showLevelMessage() {
        System.out.println("****** 고급자 레벨입니다. ******");
    }
}

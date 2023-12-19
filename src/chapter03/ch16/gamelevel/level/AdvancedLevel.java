package chapter03.ch16.gamelevel.level;

import chapter03.ch16.gamelevel.PlayerLevel;

public class AdvancedLevel extends PlayerLevel {
    @Override
    protected void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    protected void jump() {
        System.out.println("높이 Jump 합니다.");
    }

    @Override
    protected void turn() {
        System.out.println("Turn 못하지롱 ㅋㅋ");
    }

    @Override
    protected void showLevelMessage() {
        System.out.println("****** 중급자 레벨입니다. ******");
    }
}

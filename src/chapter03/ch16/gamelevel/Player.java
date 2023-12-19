package chapter03.ch16.gamelevel;

import chapter03.ch16.gamelevel.level.BeginnerLevel;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }

    public void play(int count) {
        level.go(count);
    }

}

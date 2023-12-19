package chapter03.ch16.gamelevel;

import chapter03.ch16.gamelevel.level.AdvancedLevel;
import chapter03.ch16.gamelevel.level.SuperLevel;

public class LevelTest {
    public static void main(String[] args) {

        Player p = new Player();
        p.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        p.upgradeLevel(aLevel);
        p.play(2);


        SuperLevel sLevel = new SuperLevel();
        p.upgradeLevel(sLevel);
        p.play(3);
    }
}

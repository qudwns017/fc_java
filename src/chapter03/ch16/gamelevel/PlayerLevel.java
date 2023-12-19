package chapter03.ch16.gamelevel;

public abstract class PlayerLevel {
    protected abstract void run();

    protected abstract void jump();

    protected abstract void turn();

    protected abstract void showLevelMessage();

    public void go(int count) {
        showLevelMessage();
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}

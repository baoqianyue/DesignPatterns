package ObserverPattern.BetterRealization;

/**
 * Created by BarackBao on 2017/7/2.
 */
public class TheTwoBattalion implements Battalion {
    private String name;
    private Command command;

    public TheTwoBattalion(String name, Command command) {
        this.name = name;
        this.command = command;
    }

    @Override
    public void update() {
        System.out.println(name + "接到通知，准备进攻");
    }
}

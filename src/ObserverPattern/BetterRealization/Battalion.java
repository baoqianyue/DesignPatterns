package ObserverPattern.BetterRealization;

/**
 * Created by BarackBao on 2017/7/2.
 */
public abstract class Battalion {

    private String name;
    private Command command;

    public Battalion(String name, Command command){
        this.name = name;
        this.command = command;
    }

    public abstract void update();
}

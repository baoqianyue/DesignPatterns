package ObserverPattern.BetterRealization;

/**
 * Created by BarackBao on 2017/7/2.
 */
public class ContreteBattalion extends Battalion {
    private String name;
    private Command command;

    public ContreteBattalion(String name, Command command) {
        super(name, command);
        this.name = name;
        this.command = command;
    }

    @Override
    public void update() {
        System.out.println(name + "接到命令，准备进攻");
    }
}

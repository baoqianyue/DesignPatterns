package ObserverPattern.OrdinaryRealization;

/**
 * Created by BarackBao on 2017/7/2.
 */
public class Battalion {

    private Group group;
    private String name;

    public Battalion(String name, Group command){
        this.name = name;
        this.group = command;
    }

    public void update(){
        System.out.println(name + "收到命令，准备进攻");
    }

}

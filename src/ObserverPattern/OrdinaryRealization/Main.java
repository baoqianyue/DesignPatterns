package ObserverPattern.OrdinaryRealization;

/**
 * Created by BarackBao on 2017/7/2.
 */
public class Main {

    public static void main(String[] args) {
        //指挥部
        Group command = new Group();

        //一营
        Battalion one = new Battalion("一营",command);
        //二营
        Battalion two = new Battalion("二营",command);

        command.attach(one);
        command.attach(two);

        //指挥部下达攻击命令
        command.setState(true);
        command.notifyBattalion();


    }

}

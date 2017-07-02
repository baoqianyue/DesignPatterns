package ObserverPattern.BetterRealization;

/**
 * Created by BarackBao on 2017/7/2.
 */
public class Main {

    public static void main(String[] args) {
        //具体指挥部
        Group group = new Group();
        //具体营(具体观察者)
        ContreteBattalion one = new ContreteBattalion("一营",group);
        ContreteBattalion two = new ContreteBattalion("二营",group);

        //指挥部决定发起攻击
        group.setState(true);

        //下达命令到一营和二营
        group.attach(one);
        group.attach(two);

        //战场形式发生变化，撤销二营命令
        group.detach(two);

        group.notifyBattalion();


    }
}

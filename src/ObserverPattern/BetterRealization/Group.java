package ObserverPattern.BetterRealization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BarackBao on 2017/7/2.
 */
public class Group implements Command{

    private List<Battalion> observers = new ArrayList<>();
    private boolean attack;

    @Override
    public void attach(Battalion battalion) {
        observers.add(battalion);
    }

    @Override
    public void detach(Battalion battalion) {
        observers.remove(battalion);
    }

    //用循环将每个观察者都通知到
    @Override
    public void notifyBattalion() {
        for (Battalion battalion :
                observers) {
            battalion.update();
        }
    }
    @Override
    public void setState(boolean isAttack) {
        if (isAttack == true){
            attack = true;
        }else {
            attack = false;
        }
    }
}

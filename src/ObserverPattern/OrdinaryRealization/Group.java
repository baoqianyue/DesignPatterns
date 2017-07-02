package ObserverPattern.OrdinaryRealization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BarackBao on 2017/7/2.
 */
public class Group {
    private List<Battalion> observers = new ArrayList<>();
    private boolean attack;
    public void attach(Battalion observer){
        observers.add(observer);
    }

    public void detach(Battalion observer){
        observers.remove(observer);
    }

    public void notifyBattalion(){
        for (Battalion battalion :
                observers) {
            battalion.update();
        }
    }

    public void setState(boolean isAttack){
        if (isAttack == true){
            this.attack = true;
        }else {
            this.attack = false;
        }
    }



}

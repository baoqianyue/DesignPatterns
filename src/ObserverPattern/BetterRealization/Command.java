package ObserverPattern.BetterRealization;

/**
 * Created by BarackBao on 2017/7/2.
 */
public interface Command {

    public void attach(Battalion battalion);
    public void detach(Battalion battalion);
    public void notifyBattalion();
    public void setState(boolean isAttack);


}

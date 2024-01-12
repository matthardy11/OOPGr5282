package Interfaces;
import Classes.Actor;

public interface iActorBehaviour {
public boolean isMakeOrder();
public boolean isTakeOrder();
public void setMakeOrder(boolean val);
public void setTakeOrder(boolean val);
public Actor getActor();
}

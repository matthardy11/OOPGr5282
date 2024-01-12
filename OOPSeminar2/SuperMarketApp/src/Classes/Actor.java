package Classes;
import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    abstract String getName();
    abstract void setName(String name);

    public Actor(String name) {
        this.name = name;
    }

}

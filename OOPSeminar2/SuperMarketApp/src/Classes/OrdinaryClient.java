package Classes;

public class OrdinaryClient extends Actor{
    @Override
    String getName() {
        return super.name;
    }

    @Override
    void setName(String str) {
        super.name=str;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean val) {
        super.isMakeOrder=val;
    }

    @Override
    public void setTakeOrder(boolean val) {
        super.isTakeOrder=val;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    public OrdinaryClient(String name) {
        super(name);
    }
}

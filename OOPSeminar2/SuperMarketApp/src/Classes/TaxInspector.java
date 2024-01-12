package Classes;

import Interfaces.iActorBehaviour;

public class TaxInspector implements iActorBehaviour {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxInspector() {
        this.name = "Tax.Audit";
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean val) {
        isMakeOrder=val;
    }

    @Override
    public void setTakeOrder(boolean val) {
        isTakeOrder=val;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }
}

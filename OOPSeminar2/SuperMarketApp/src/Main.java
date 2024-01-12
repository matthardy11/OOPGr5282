import Classes.*;
import Interfaces.iActorBehaviour;

public class Main {
    public static void main(String[] args) {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Maria");
        iActorBehaviour client3 = new SpecialClient("Gubernator", 1);
        iActorBehaviour client4 = new TaxInspector();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        magnit.update();
    }

}
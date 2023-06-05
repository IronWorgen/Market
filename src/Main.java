import classes.*;
import interfaces.iActorBehaviour;

public class Main {
    public static void main(String[] args) {

        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Dasha");
        iActorBehaviour client3 = new SpecialClient("Prezident", 1);
        iActorBehaviour client4 = new ActionClient("Ivan", "Скидка", 1);

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);
        market.acceptToMarket(new TaxService());

        market.update();

        market.takeItem(client4.getActor(), "iPhone");
    }
}
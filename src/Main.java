import classes.Market;
import classes.OrdinaryClient;
import classes.SpecialClient;
import classes.TaxService;
import interfaces.iActorBehaviour;

public class Main {
    public static void main(String[] args) {

        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Dasha");
        iActorBehaviour client3 = new SpecialClient("Prezident", 1);

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(new TaxService());

        market.update();
    }
}
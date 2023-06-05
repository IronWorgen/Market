package interfaces;

import classes.Actor;

import java.util.List;

public interface iMarketBehaviour {
    // Прийти на маркет
    void acceptToMarket(iActorBehaviour actor);
    void releaseFromMarket(List<Actor> actors);

    void update();


}

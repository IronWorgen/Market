package interfaces;

import classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);
    void releaseFromQueue();
    //забрать заказ
    void takeOrder();
    // сделать заказ
    void giveOrder();

}

package interfaces;

import classes.Actor;

public interface iActorBehaviour {
    /**
     * установить флаг заказа
     * @param makeOrder true- заказ сделан, иначе false
     */
    void setMakeOrder(boolean makeOrder);
    /**
     * установить флаг получения заказа
     * @param pickUpOrder true- заказ получен, иначе false
     */
    void setTakeOrder(boolean pickUpOrder);

    /**
     * вернуть значение поля isMakeOrder
     * @return
     */
    boolean isMakeOrder();
    /**
     * вернуть значение поля isTakeOrder
     * @return
     */
    boolean isTakeOrder();

    Actor getActor();
}

package interfaces;

import classes.Actor;

public interface iQueueBehaviour {
    /**
     * метод добавляет клиента в очередь
     * @param actor
     */
    void takeInQueue(iActorBehaviour actor);
    /**
     * метод удаляет всех клиентов, получивших заказ, из очереди
     * вызывает метод releaseFromMarket() для этих клиентов
     */
    void releaseFromQueue();
    /**
     * метод создает заказ для всех клиентов, которые еще не сделали заказ
     */
    void takeOrder();
    /**
     * метод выдает заказ всем клиентам, которые сделали заказ
     */
    void giveOrder();

}

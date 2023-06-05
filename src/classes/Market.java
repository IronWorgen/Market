package classes;



import java.util.List;
import java.util.ArrayList;

import interfaces.iActorBehaviour;
import interfaces.iMarketBehaviour;
import interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour,iQueueBehaviour {
    /**  Очередь клинтов*/
    private List<iActorBehaviour> queue;



    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     *  Метод добавляет клиента в магазин и помещает его в очередь
     * @param actor
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * метод добавляет клиента в очередь
     * @param actor
     */

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    /**
     * метод удаляет клиентов магазина
     * @param actors - список клиентов которых надо удалить
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    /**
     * метод обновляет текущее состояние магазина
     * создает заказы для клиентов,
     * выдает заказы клиентам,
     * удаляет клиента из магазина
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * метод выдает заказ всем клиентам, которые сделали заказ
     */
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }

    }

    /**
     * метод удаляет всех клиентов, получивших заказ, из очереди
     * вызывает метод releaseFromMarket() для этих клиентов
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehaviour actor:queue)
        {
            if(actor.isTakeOrder())
            {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }


    /**
     * метод создает заказ для всех клиентов, которые еще не сделали заказ
     */
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }

    }

    /**
     * принять товар возвращенный пользователем
     * @param actor - пользователь
     * @param itemName - название товара
     */
    @Override
    public void takeItem(Actor actor, String itemName){
        System.out.printf("Пользователь %s вернул товар \"%s\"", actor.getName(), itemName);
    }





}

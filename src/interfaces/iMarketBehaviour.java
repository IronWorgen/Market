package interfaces;

import classes.Actor;

import java.util.List;

public interface iMarketBehaviour {
    /**
     *  Метод добавляет клиента в магазин и помещает его в очередь
     * @param actor
     */
    void acceptToMarket(iActorBehaviour actor);
    /**
     * метод удаляет клиентов магазина
     * @param actors - список клиентов которых надо удалить
     */
    void releaseFromMarket(List<Actor> actors);
    /**
     * метод обновляет текущее состояние магазина
     * создает заказы для клиентов,
     * выдает заказы клиентам,
     * удаляет клиента из магазина
     */

    void update();

    /**
     * принять товар возвращенный пользователем
     * @param actor - пользователь
     * @param nameItem - название товара
     */
    void takeItem(Actor actor,String nameItem);


}

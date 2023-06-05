package classes;


import interfaces.iActorBehaviour;
import interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    /** Имя клиента     */
    protected String name;
    /** true если клиент забрал заказ, иначе false*/
    protected boolean isTakeOrder;
    /** true если клиент сделал заказ, иначе false*/
    protected boolean isMakeOrder;
    public Actor(String name){
        this.name = name;
    }


    abstract public String getName();

}

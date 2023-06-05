package classes;

public class OrdinaryClient extends Actor{
    public OrdinaryClient(String name) {
        super(name);
    }

    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean flag) {
        super.isTakeOrder = flag;
    }

    public void setMakeOrder(boolean flag) {
        super.isMakeOrder = flag;
    }

    public Actor getActor() {
        return this;
    }




}

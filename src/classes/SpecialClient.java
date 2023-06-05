package classes;

public class SpecialClient extends Actor {
    /** id VIP клиента     */
    private int idVIP;

    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
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

    public int getIdVIP() {
        return idVIP;
    }

}

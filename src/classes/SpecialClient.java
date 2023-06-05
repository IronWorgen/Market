package classes;

public class SpecialClient extends Actor {
    /** id VIP клиента     */
    private int idVIP;

    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }
    /**
     *
     * @param item - название товара
     * @return
     */
    @Override
    public String returnOrder(String item) {
        return item;
    }

    public String getName() {
        return super.name;
    }
    /**
     * вернуть значение поля isTakeOrder
     * @return
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * вернуть значение поля isMakeOrder
     * @return
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * установить флаг заказа
     * @param flag true- заказ получен, иначе false
     */

    public void setTakeOrder(boolean flag) {
        super.isTakeOrder = flag;
    }

    /**
     * установить флаг заказа
     * @param flag true- заказ сделан, иначе false
     */
    public void setMakeOrder(boolean flag) {
        super.isMakeOrder = flag;
    }

    /**
     * вернуть ссылку на этого клиента
     * @return
     */
    public Actor getActor() {
        return this;
    }

    /**
     * вернуть ID клиента
     * @return
     */
    public int getIdVIP() {
        return idVIP;
    }

}

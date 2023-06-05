package classes;

public class ActionClient extends Actor{
    /** название акции  */
    private String nameAction;
    /** id акционного клиента */
    private int idActionClient;
    /** количество клиентов поучаствовавших в акции */
    private static  int countActionClient;

    public ActionClient(String name, String nameAction, int idActionClient) {
        super(name);
        this.nameAction = nameAction;
        this.idActionClient = idActionClient;
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

    public String getNameAction() {
        return nameAction;
    }

    public void setNameAction(String nameAction) {
        this.nameAction = nameAction;
    }

    public int getIdActionClient() {
        return idActionClient;
    }

    public void setIdActionClient(int idActionClient) {
        this.idActionClient = idActionClient;
    }

    public static int getCountActionClient() {
        return countActionClient;
    }

    public static void setCountActionClient(int countActionClient) {
        ActionClient.countActionClient = countActionClient;
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


}

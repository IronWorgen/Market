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

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {

    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {

    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }

    @Override
    public Actor getActor() {
        return null;
    }
}

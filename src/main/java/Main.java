import controller.Controller;
import model.CreditModel;
import view.View;

/**
 * Created by a-morenets on 17.11.2016.
 */
public class Main {

    /**
     * Main function
     * @param args
     */
    public static void main(String[] args) {
        CreditModel creditModel = new CreditModel();
        View view = new View();
        Controller controller = new Controller(creditModel, view);
        controller.process();
    }

}

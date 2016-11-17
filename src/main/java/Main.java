import controller.Controller;
import model.Model;
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
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.process();
    }

}

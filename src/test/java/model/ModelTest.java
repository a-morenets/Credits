package model;

import controller.Controller;
import org.junit.Before;
import org.junit.Test;
import view.View;

import static org.junit.Assert.*;

/**
 * Created by a-morenets on 18.11.2016.
 */
public class ModelTest {
    Model model;

    @Before
    public void setUp() throws Exception {
        model = new Model();
        Controller controller = new Controller(model, new View());
    }

    @Test
    public void findCreditByPrepaymentAllowed() throws Exception {
        assertEquals(9, model.findCreditPrepaymentAllowed().size());
    }

}
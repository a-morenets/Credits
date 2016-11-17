package model;

import model.entity.Credit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a-morenets on 17.11.2016.
 */
public class Model {
    private List<Credit> creditList;

    /**
     * Constructor
     */
    public Model() {
        creditList = new ArrayList<>();
    }

    // Getters & Setters

    public List<Credit> getCreditList() {
        return creditList;
    }

    public void setCreditList(List<Credit> creditList) {
        this.creditList = creditList;
    }

    /**
     * Find credits by PrepaymentAllowed
     * @return
     */
    public ArrayList findCreditByPrepaymentAllowed() {
        return new ArrayList() {
            {
                for (Credit credit : creditList) {
                    if (credit.isPrepaymentAllowed()) {
                        add(credit);
                    }
                }
            }
        };
    }

}

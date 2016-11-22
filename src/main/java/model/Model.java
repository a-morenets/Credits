package model;

import model.entity.Credit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
     * Filter credits by PrepaymentAllowed
     * @return
     */
    public List<Credit> findCreditPrepaymentAllowed() {
        return creditList.stream().filter(c -> c.isPrepaymentAllowed()).collect(Collectors.toList());
    }

    /**
     * Filter credits by PrepaymentAllowed
     * @return
     */
    public List<Credit> findCreditByAnnualPercentageLessThan(double annualPercentage) {
        return creditList.stream().filter(c -> c.getAnnualPercentage() <= annualPercentage).collect(Collectors.toList());
    }

}

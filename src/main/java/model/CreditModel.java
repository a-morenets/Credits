package model;

import model.entity.Credit;
import model.entity.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Class CreditModel represents a credit model of a bank
 * Created by a-morenets on 17.11.2016.
 */
public class CreditModel {

    /** List of credits */
    private List<Credit> creditList;

    /**
     * Constructor
     * Creates an empty ArrayList for credit storage
     */
    public CreditModel() {
        creditList = new ArrayList<>();
    }

    /* Getters & Setters */

    public List<Credit> getCreditList() {
        return creditList;
    }

    public void setCreditList(List<Credit> creditList) {
        this.creditList = creditList;
    }

    /**
     * Finds credits over specified condition
     * @param predicate condition
     * @return list filtered by condition
     */
    public List<Credit> findCredits(Predicate<Credit> predicate) {
        return creditList.stream().filter(predicate).collect(Collectors.toList());
    }

    /**
     * Loads initial credit data from enum
     * @return list of Credit objects
     */
    public List<Credit> initCredits() {
        List<Credit> tempList = new ArrayList<>();
        for (Data data : Data.values()) {
            Credit credit = new Credit(data.getName(), data.getCurrency(), data.getBank(), data.getMonths(),
                    data.getAnnualPercentage(), data.isPrepaymentAllowed(), data.isIncreaseable());
            tempList.add(credit);
        }
        return tempList;
    }
}

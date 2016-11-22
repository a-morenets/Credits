package controller;

import model.Model;
import model.entity.Credit;
import model.entity.Data;
import view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a-morenets on 17.11.2016.
 */
public class Controller {
    Model model;
    View view;

    /**
     * Constructor
     * @param model
     * @param view
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Process actions
     */
    public void process() {
        model.setCreditList(initCredits());
        view.printCredits(View.CREDIT_LIST, model.getCreditList());
        view.printCredits(View.CREDITS_WITH_PREPAYMENT_ALLOWED, model.findCreditPrepaymentAllowed());
        view.printCredits(View.CREDITS_BY_ANNUAL_PERCENTAGE, model.findCreditByAnnualPercentageLessThan(8));
    }

    /**
     * Loads credit data from enum
     * @return
     */
    private List<Credit> initCredits() {
        List<Credit> tempList = new ArrayList<>();
        for (Data data : Data.values()) {
            Credit credit = new Credit(data.getName(), data.getCurrency(), data.getBank(), data.getMonths(),
                    data.getAnnualPercentage(), data.isPrepaymentAllowed(), data.isIncreaseable());
            tempList.add(credit);
        }
        return tempList;
    }

}

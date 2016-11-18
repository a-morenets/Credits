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
        model.setCreditList(loadCredits());
    }

    /**
     * Process actions
     */
    public void process() {
        view.printCredits(model.getCreditList());
        view.printCredits(model.findCreditByPrepaymentAllowed());
    }

    /**
     * Loads credit data from enum
     * @return
     */
    private List<Credit> loadCredits() {
        List<Credit> tempList = new ArrayList<>();
        for (Data data : Data.values()) {
            Credit credit = new Credit(data.getName(), data.getCurrency(), data.getBankName(), data.getMonths(),
                    data.getAnnualPercentage(), data.isPrepaymentAllowed(), data.isIncreaseable());
            tempList.add(credit);
        }
        return tempList;
    }

}

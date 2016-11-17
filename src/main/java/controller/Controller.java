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
     *
     * @param model
     * @param view
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     *
     */
    public void process() {
        model.setCreditList(loadCredits());
        view.printAllCredits(model.getCreditList());
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

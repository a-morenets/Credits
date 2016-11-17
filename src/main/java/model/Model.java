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
     *
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

}

package view;

import model.entity.Credit;

import java.util.List;

/**
 * Created by a-morenets on 17.11.2016.
 */
public class View {

    /**
     *
     * @param creditList
     */
    public void printAllCredits(List<Credit> creditList) {
        for (Credit credit : creditList) {
            System.out.println(credit);
        }
    }

}

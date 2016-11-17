package view;

import model.entity.Credit;

import java.util.List;

/**
 * Created by a-morenets on 17.11.2016.
 */
public class View {

    /**
     * Print list
     * @param creditList
     */
    public void printCredits(List<Credit> creditList) {
        System.out.println("===============================================");
        for (Credit credit : creditList) {
            System.out.println(credit);
        }
    }

}

package view;

import model.entity.Credit;

import java.util.List;

/**
 * Created by a-morenets on 17.11.2016.
 */
public class View {
    /* Text constants */
    public static final String CREDIT_LIST = "Credit list";
    public static final String CREDITS_WITH_PREPAYMENT_ALLOWED = "Credits with prepayment allowed";
    public static final String CREDITS_BY_ANNUAL_PERCENTAGE = "Credits by annual percentage";

    /**
     * Print list
     * @param creditList    List of credits
     */
    public void printCredits(String header, List<Credit> creditList) {
        System.out.println();
        System.out.println(header);
        for (int i = 0; i < header.length(); i++) {
            System.out.print("-");
        }
        System.out.println();

        for (Credit credit : creditList) {
            System.out.println(credit);
        }
    }

}

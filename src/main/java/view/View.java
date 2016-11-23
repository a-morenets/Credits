package view;

import model.entity.Credit;

import java.util.List;

/**
 * Class View represents mechanism for displaying data
 * Created by a-morenets on 17.11.2016.
 */
public class View {

    /* Text constants */
    public static final String CREDIT_LIST = "Credit list";
    public static final String CREDITS_WITH_PREPAYMENT_ALLOWED = "Credits with prepayment allowed";
    public static final String CREDITS_BY_ANNUAL_PERCENTAGE = "Credits by annual percentage";
    public static final String CREDITS_8_MONTHS_6_INCREASABLE_PREPAYMENT_ALLOWED =
            "Credits (% < 8 && months >= 6, increasable, prepayment allowed)";
    public static final String INCREASABLE = "Increasable";


    /**
     * Print list with header
     * @param header     text header before data
     * @param creditList list to be printed
     */
    public void printCredits(String header, List<Credit> creditList) {
        System.out.println();
        System.out.println(header);

        /* Underline header */
        for (int i = 0; i < header.length(); i++) {
            System.out.print("-");
        }
        System.out.println();

        /* Print list data */
        for (Credit credit : creditList) {
            System.out.println(credit);
        }
    }
}

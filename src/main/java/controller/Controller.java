package controller;

import model.CreditModel;
import model.entity.Credit;
import view.View;

import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Class Controller provides user interaction and implements MVC architecture of application
 * Created by a-morenets on 17.11.2016.
 */
public class Controller {

    /** Reference to Model unit of MVC based architecture of application */
    private CreditModel creditModel;

    /** Reference to View unit of MVC based architecture of application */
    private View view;

    /**
     * Constructor
     * @param creditModel reference to {@link CreditModel} unit
     * @param view        reference to {@link View} unit
     */
    public Controller(CreditModel creditModel, View view) {
        this.creditModel = creditModel;
        this.view = view;
    }

    /**
     * Process actions
     */
    public void process() {

        /* Load initial data */
        creditModel.setCreditList(creditModel.initCredits());

        /* Print all credits */
        view.printCredits(View.CREDIT_LIST, creditModel.getCreditList());

        /* Print credits. Filter: by prepaymentAllowed */
        Predicate<Credit> creditsByPrepaymentAllowed = c -> c.isPrepaymentAllowed();
        view.printCredits(View.CREDITS_WITH_PREPAYMENT_ALLOWED, creditModel.findCredits(creditsByPrepaymentAllowed));

        /* Print credits. Filter: by annualPercentage */
        Predicate<Credit> creditsByAnnualPercentage = c -> c.getAnnualPercentage() < 8;
        view.printCredits(View.CREDITS_BY_ANNUAL_PERCENTAGE, creditModel.findCredits(creditsByAnnualPercentage));

        /* Print credits. Filter: by isIncreasable */
        view.printCredits(View.INCREASABLE,
                creditModel.getCreditList().stream()
                        .filter(Credit::isIncreasable)
                        .collect(Collectors.toList()));

        /* Print credits. Filter: complex condition */
        Predicate<Credit> complexCondition =
                c -> c.getAnnualPercentage() < 8 && c.getMonths() >= 6;
        complexCondition = complexCondition
                .and(c -> c.isIncreasable())
                .or(c -> c.isPrepaymentAllowed()); // TODO: Something wrong!!!
        view.printCredits(View.CREDITS_8_MONTHS_6_INCREASABLE_PREPAYMENT_ALLOWED,
                creditModel.findCredits(complexCondition));
    }
}

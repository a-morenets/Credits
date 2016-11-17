package model.entity;

/**
 * Created by a-morenets on 17.11.2016.
 */
public enum Data {
    // Initial data:
    Credit01("Fast", Currency.UAH, "European Bank", 3, 14.5, false, false),
    Credit02("Medium", Currency.UAH, "European Bank", 6, 15.7, false, false),
    Credit03("Strong", Currency.UAH, "European Bank", 12, 19.3, false, false);

    private String name;
    private Currency currency;
    private String bankName;
    private int months;
    private double annualPercentage;
    private boolean prepaymentAllowed;
    private boolean isIncreaseable;

    Data(String name, Currency currency, String bankName, int months, double annualPercentage,
         boolean prepaymentAllowed, boolean isIncreaseable) {

        this.name = name;
        this.currency = currency;
        this.bankName = bankName;
        this.months = months;
        this.annualPercentage = annualPercentage;
        this.prepaymentAllowed = prepaymentAllowed;
        this.isIncreaseable = isIncreaseable;
    }

    // Getters

    public String getName() {
        return name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getBankName() {
        return bankName;
    }

    public int getMonths() {
        return months;
    }

    public double getAnnualPercentage() {
        return annualPercentage;
    }

    public boolean isPrepaymentAllowed() {
        return prepaymentAllowed;
    }

    public boolean isIncreaseable() {
        return isIncreaseable;
    }

}

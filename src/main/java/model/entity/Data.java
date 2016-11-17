package model.entity;

/**
 * Created by a-morenets on 17.11.2016.
 */
public enum Data {
    // Initial data:
    Credit01("Fast", Currency.UAH, "European Bank", 3, 14.5, false, false),
    Credit02("Medium", Currency.UAH, "European Bank", 6, 15.7, false, false),
    Credit03("Strong", Currency.UAH, "European Bank", 12, 19.3, false, false),
    Credit04("Fast", Currency.EUR, "Deutsche Bank", 3, 7.0, false, true),
    Credit05("Medium", Currency.EUR, "Deutsche Bank", 6, 8.0, false, true),
    Credit06("Medium", Currency.EUR, "Deutsche Bank", 12, 9.0, false, true),
    Credit07("Fast", Currency.USD, "American Bank", 3, 8.4, false, true),
    Credit08("Medium", Currency.USD, "American Bank", 6, 9.6, false, true),
    Credit09("Medium", Currency.USD, "American Bank", 12, 10.1, false, true),
    Credit10("Fast +", Currency.UAH, "European Bank", 3, 14.5, true, false),
    Credit11("Medium +", Currency.UAH, "European Bank", 6, 15.7, true, false),
    Credit12("Strong +", Currency.UAH, "European Bank", 12, 19.3, true, false),
    Credit13("Fast +", Currency.EUR, "Deutsche Bank", 3, 7.0, true, true),
    Credit14("Medium +", Currency.EUR, "Deutsche Bank", 6, 8.0, true, true),
    Credit15("Medium +", Currency.EUR, "Deutsche Bank", 12, 9.0, true, true),
    Credit16("Fast +", Currency.USD, "American Bank", 3, 8.4, true, true),
    Credit17("Medium +", Currency.USD, "American Bank", 6, 9.6, true, true),
    Credit18("Medium +", Currency.USD, "American Bank", 12, 10.1, true, true);

    /** Data fields */
    private String name;
    private Currency currency;
    private String bankName;
    private int months;
    private double annualPercentage;
    private boolean prepaymentAllowed;
    private boolean isIncreaseable;

    /**
     * Constructor
     */
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

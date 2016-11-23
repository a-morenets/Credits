package model.entity;

/**
 * Enum Data represents a set of initial values for Credit objects
 * Created by a-morenets on 17.11.2016.
 */
public enum Data {

    /* Initial data */
    Credit01("Fast", Currency.UAH, new Bank("European Bank", 123456), 3, 14.5, false, false),
    Credit02("Medium", Currency.UAH, new Bank("Deutshe Bank", 457889), 6, 15.7, true, false),
    Credit03("Strong", Currency.UAH, new Bank("Bank of NY", 3254548), 12, 19.3, false, false),
    Credit04("Fast", Currency.EUR, new Bank("Bank of NY", 985421), 3, 7.0, true, true),
    Credit05("Medium", Currency.EUR, new Bank("Deutshe Bank", 354785), 6, 8.0, false, true),
    Credit06("Medium", Currency.EUR, new Bank("European Bank", 123654), 12, 9.0, true, true),
    Credit07("Fast", Currency.USD, new Bank("Bank of NY", 658452), 3, 8.4, true, false),
    Credit08("Medium", Currency.USD, new Bank("Deutshe Bank", 221145), 6, 9.6, false, false),
    Credit09("Medium", Currency.USD, new Bank("Bank of NY", 988854), 12, 10.1, false, true),
    Credit10("Fast +", Currency.UAH, new Bank("European Bank", 33552), 3, 14.5, true, false),
    Credit11("Medium +", Currency.UAH, new Bank("Bank of NY", 335554), 6, 15.7, true, false),
    Credit12("Strong +", Currency.UAH, new Bank("Deutshe Bank", 112545), 12, 19.3, true, false),
    Credit13("Fast +", Currency.EUR, new Bank("Bank of NY", 988854), 3, 6.5, true, true),
    Credit14("Medium +", Currency.EUR, new Bank("European Bank", 665445), 6, 7.4, true, false),
    Credit16("Fast +", Currency.USD, new Bank("European Bank", 554445), 3, 8.4, false, true),
    Credit17("Medium +", Currency.USD, new Bank("Deutshe Bank", 122221), 6, 9.6, false, false),
    Credit18("Medium +", Currency.USD, new Bank("Deutshe Bank", 889887), 12, 10.1, true, true);

    /** Data fields */

    private String name;
    private Currency currency;
    public Bank bank;
    private int months;
    private double annualPercentage;
    private boolean prepaymentAllowed;
    private boolean isIncreaseable;

    /**
     * Constructor
     */
    Data(String name, Currency currency, Bank bank, int months, double annualPercentage,
         boolean prepaymentAllowed, boolean isIncreasable) {

        this.name = name;
        this.currency = currency;
        this.bank = bank;
        this.months = months;
        this.annualPercentage = annualPercentage;
        this.prepaymentAllowed = prepaymentAllowed;
        this.isIncreaseable = isIncreasable;
    }

    /* Getters */

    public String getName() {
        return name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Bank getBank() {
        return bank;
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

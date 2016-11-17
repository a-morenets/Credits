package model.entity;

/**
 * Created by a-morenets on 17.11.2016.
 */
public class Credit {
    private String name;
    private Currency currency;
    private String bankName;
    private int months;
    private double annualPercentage;
    private boolean prepaymentAllowed;
    private boolean isIncreaseable;

    /**
     *
     * @param name
     * @param currency
     * @param bankName
     * @param months
     * @param annualPercentage
     * @param prepaymentAllowed
     * @param isIncreaseable
     */
    public Credit(String name, Currency currency, String bankName, int months, double annualPercentage,
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

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", currency=" + currency +
                ", bankName='" + bankName + '\'' +
                ", months=" + months +
                ", annualPercentage=" + annualPercentage +
                ", prepaymentAllowed=" + prepaymentAllowed +
                ", isIncreaseable=" + isIncreaseable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Credit credit = (Credit) o;

        if (months != credit.months) return false;
        if (Double.compare(credit.annualPercentage, annualPercentage) != 0) return false;
        if (prepaymentAllowed != credit.prepaymentAllowed) return false;
        if (isIncreaseable != credit.isIncreaseable) return false;
        if (!name.equals(credit.name)) return false;
        if (currency != credit.currency) return false;
        return bankName.equals(credit.bankName);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + currency.hashCode();
        result = 31 * result + bankName.hashCode();
        result = 31 * result + months;
        temp = Double.doubleToLongBits(annualPercentage);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (prepaymentAllowed ? 1 : 0);
        result = 31 * result + (isIncreaseable ? 1 : 0);
        return result;
    }

}

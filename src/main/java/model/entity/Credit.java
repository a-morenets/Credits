package model.entity;

/**
 * Created by a-morenets on 17.11.2016.
 */
public class Credit {
    private String name;
    private Currency currency;
    private Bank bank;
    private int months;
    private double annualPercentage;
    private boolean prepaymentAllowed;
    private boolean isIncreaseable;

    /**
     * Constructor
     * @param name
     * @param currency
     * @param bank
     * @param months
     * @param annualPercentage
     * @param prepaymentAllowed
     * @param isIncreaseable
     */
    public Credit(String name, Currency currency, Bank bank, int months, double annualPercentage, boolean prepaymentAllowed, boolean isIncreaseable) {
        this.name = name;
        this.currency = currency;
        this.bank = bank;
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

    @Override
    public String toString() {
        return "Credit{" +
                "name='" + name + '\'' +
                ", currency=" + currency +
                ", bank=" + bank +
                ", months=" + months +
                ", annualPercentage=" + annualPercentage +
                ", prepaymentAllowed=" + prepaymentAllowed +
                ", isIncreaseable=" + isIncreaseable +
                '}';
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
        if (name != null ? !name.equals(credit.name) : credit.name != null) return false;
        if (currency != credit.currency) return false;
        return bank != null ? bank.equals(credit.bank) : credit.bank == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (bank != null ? bank.hashCode() : 0);
        result = 31 * result + months;
        temp = Double.doubleToLongBits(annualPercentage);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (prepaymentAllowed ? 1 : 0);
        result = 31 * result + (isIncreaseable ? 1 : 0);
        return result;
    }
}

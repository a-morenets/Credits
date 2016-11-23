package model.entity;

/**
 * Class Bank represents a bank
 * Created by a-morenets on 22.11.2016.
 */
public class Bank {

    /** Bank name */
    private String name;

    /** Code of international financial organization (MFI) */
    private int bankCode;

    /**
     * Constructor
     * @param name        bank name
     * @param bankCode    MFI
     */
    public Bank(String name, int bankCode) {
        this.name = name;
        this.bankCode = bankCode;
    }

    /* Getters & Setters*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        if (bankCode != bank.bankCode) return false;
        return name != null ? name.equals(bank.name) : bank.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) bankCode;
        return result;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", bankCode=" + bankCode +
                '}';
    }
}

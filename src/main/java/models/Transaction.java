package models;

/**
 * @author samyakjain
 * @since 05/12/21
 */
public class Transaction {
    private String sender;

    private String receiver;

    private Double amount;

    private Currency currency;

    public Transaction(String sender, String receiver, Double amount, Currency currency) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.currency = currency;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "\nTransaction{" + "sender='" + sender + '\'' + ", receiver='" + receiver + '\'' + ", amount=" + amount + ", currency=" + currency + "}\n";
    }
}

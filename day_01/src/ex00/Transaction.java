package ex00;

import javax.jws.soap.SOAPBinding;
import java.util.UUID;

enum TransferCategory {
    DEBITS,
    CREDITS
}

public class Transaction {
    private final UUID identifier;
    private User recipient;
    private User sender;
    private TransferCategory transferCategory;
    private Integer transferAmount;

    public Transaction(UUID identifier, User recipient, User sender, TransferCategory transferCategory, Integer transferAmount) {
        this.identifier = identifier;
        this.recipient = recipient;
        this.sender = sender;
        if (recipient.getIdentifier().equals(sender.getIdentifier())) {
            System.out.println("Transaction has been cancelled: recipient and sender are the same user.");
            return ;
        }
        this.transferCategory = transferCategory;
        this.transferAmount = transferAmount;
        if (this.sender.getBalance() <= 0){
            System.out.println("Transaction has been cancelled: negative sender's balance.");
            return;
        }
        if (this.sender.getBalance() - this.transferAmount < 0){
            System.out.println("Transaction has been cancelled: sender's insufficient funds.");
            return;
        }
        this.sender.setBalance(this.sender.getBalance() - this.transferAmount);
        this.recipient.setBalance((this.recipient.getBalance() + this.transferAmount));
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public User getRecipient() {
        return recipient;
    }

    public User getSender() {
        return sender;
    }

    public TransferCategory getTransferCategory() {
        return transferCategory;
    }

    public Integer getTransferAmount() {
        return transferAmount;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setTransferCategory(TransferCategory transferCategory) {
        this.transferCategory = transferCategory;
    }

    public void setTransferAmount(Integer transferAmount) {
        this.transferAmount = transferAmount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "identifier=" + identifier +
                ", recipient=" + recipient +
                ", sender=" + sender +
                ", transferCategory=" + transferCategory +
                ", transferAmount=" + transferAmount +
                '}';
    }
}

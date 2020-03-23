package com.phone.shop.dto;

public class TransactionDto {
    private String id;
    private String transactionNumber;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(final String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    @Override
    public String toString() {
        return "TransactionDto{" +
                "id='" + id + '\'' +
                ", transactionNumber='" + transactionNumber + '\'' +
                '}';
    }
}

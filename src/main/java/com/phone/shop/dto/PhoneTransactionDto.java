package com.phone.shop.dto;

public class PhoneTransactionDto {
    private String id;
    private TransactionDto transaction;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public TransactionDto getTransaction() {
        return transaction;
    }

    public void setTransaction(final TransactionDto transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "PhoneDto{" +
                "id='" + id + '\'' +
                ", transaction=" + transaction +
                '}';
    }
}

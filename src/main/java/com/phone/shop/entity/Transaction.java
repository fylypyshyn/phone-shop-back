package com.phone.shop.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Objects;

@Document(collection = "transaction")
public class Transaction extends Audit implements Serializable {
    @Id
    private String id;

    @Field("transactionNumber")
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
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        final Transaction that = (Transaction) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getTransactionNumber(), that.getTransactionNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getTransactionNumber());
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", transactionNumber='" + transactionNumber + '\'' +
                '}';
    }
}

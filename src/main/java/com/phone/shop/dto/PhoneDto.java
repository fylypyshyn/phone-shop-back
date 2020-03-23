package com.phone.shop.dto;

import com.phone.shop.entity.Transaction;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class PhoneDto {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imagePath;
    private Set<Transaction> transactions = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(final Set<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(final String imagePath) {
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PhoneDto{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imagePath=" + imagePath +
                ", name=" + name +
                '}';
    }
}

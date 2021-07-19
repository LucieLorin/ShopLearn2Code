package com.learn2code.Shop.domain;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Objects;

public class Product {

    @Nullable
    private Integer id;
    @NonNull
    private  int merchant_Id;
    @NonNull
    private String name;
    @NonNull
    private  String description;
    @NonNull
    private double price;
    @NonNull
    private Timestamp created_At;
    @NonNull
    private int available;

    public Product(){

    }

    public Product(int merchant_Id, @NonNull String name, @NonNull String description, double price, int available, Timestamp created_At) {
        this.merchant_Id = merchant_Id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.available = available;
        this.created_At = Timestamp.from(Instant.now());

    }

    @Nullable
    public Integer getId() {
        return id;
    }

    public void setId(@Nullable Integer id) {
        this.id = id;
    }

    public int getMerchant_Id() {
        return merchant_Id;
    }

    public void setMerchant_Id(int merchant_Id) {
        this.merchant_Id = merchant_Id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @NonNull
    public Timestamp getCreated_At() {
        return created_At;
    }

    public void setCreated_At(@NonNull Timestamp created_At) {
        this.created_At = created_At;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return merchant_Id == product.merchant_Id && Double.compare(product.price, price) == 0 && available == product.available && Objects.equals(id, product.id) && name.equals(product.name) && description.equals(product.description) && created_At.equals(product.created_At);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, merchant_Id, name, description, price, created_At, available);
    }
}

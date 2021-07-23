package com.learn2code.Shop.db.servis.api.Request;

import org.springframework.lang.NonNull;

import java.util.Objects;

public class UpdateProductRequest {


    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private Double price;
    @NonNull
    private int availible;

    public UpdateProductRequest(@NonNull String name, @NonNull String description, @NonNull Double price, int availible) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.availible = availible;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    @NonNull
    public Double getPrice() {
        return price;
    }

    public int getAvailible() {
        return availible;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateProductRequest that = (UpdateProductRequest) o;
        return availible == that.availible && name.equals(that.name) && description.equals(that.description) && price.equals(that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, availible);
    }

}

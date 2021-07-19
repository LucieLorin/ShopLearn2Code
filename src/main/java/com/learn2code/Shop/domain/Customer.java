package com.learn2code.Shop.domain;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Objects;

public class Customer {

    @Nullable
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String surname;
    @NonNull
    private String email;
    @NonNull
    private String address;
    @Nullable
    private Integer age;
    @Nullable
    private String phone_Number;

    public Customer() {

    }

    public Customer(@NonNull String name, @NonNull String surname, @NonNull String email, @NonNull String address, @Nullable Integer age, @Nullable String phone_Number) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.age = age;
        this.phone_Number = phone_Number;
    }

    @Nullable
    public Integer getId() {
        return id;
    }

    public void setId(@Nullable Integer id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getSurname() {
        return surname;
    }

    public void setSurname(@NonNull String surname) {
        this.surname = surname;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getAddress() {
        return address;
    }

    public void setAddress(@NonNull String address) {
        this.address = address;
    }

    @Nullable
    public Integer getAge() {
        return age;
    }

    public void setAge(@Nullable Integer age) {
        this.age = age;
    }

    @Nullable
    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhoneNumber(@Nullable String phoneNumber) {
        this.phone_Number = phone_Number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && name.equals(customer.name) && surname.equals(customer.surname) && email.equals(customer.email) && address.equals(customer.address) && Objects.equals(age, customer.age) && Objects.equals(phone_Number, customer.phone_Number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, address, age, phone_Number);
    }
}

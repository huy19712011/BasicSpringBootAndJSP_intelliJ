package com.example.basicspringbootandjsp_intellij.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Employee {

    @Min(2000)
    private long id;

    @NotNull
    @Size(min = 3, message = "name must be at least 3 characters")
    private String name;

    @NotNull
    //@Size(min = 5)
    @Pattern(regexp = "[0-9]{5}", message = "exactly 5 numbers")
    private String contactNumber;

    public Employee() {
    }

    public Employee(long id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}

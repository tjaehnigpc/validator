package com.masterarbeit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Jan on 14.04.2017.
 */
@Entity
public class Patient_anonymized {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private long insuranceNumber;
    private long phoneNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String insurance;

    public Patient_anonymized(){}

    public Patient_anonymized(int id, String firstName, String lastName, String email, String insurance, int insPolicyNumber, int phoneNumber){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.insurance = insurance;
        this.insuranceNumber = insPolicyNumber;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public long getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }
}
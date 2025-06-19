package com.library.api.dtos;

import java.util.ArrayList;
import java.util.List;

public class BorrowerDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private List<LoanDTO> loans = new ArrayList<>();

    public BorrowerDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<LoanDTO> getLoans() {
        return loans;
    }

    public void setLoans(List<LoanDTO> loans) {
        this.loans = loans;
    }
}
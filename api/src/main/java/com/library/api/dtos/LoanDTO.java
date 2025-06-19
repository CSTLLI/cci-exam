package com.library.api.dtos;

import java.time.LocalDate;

public class LoanDTO {
    private Long id;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private String borrowerName;

    public LoanDTO() {}

    public LoanDTO(Long id, LocalDate loanDate, LocalDate dueDate, String borrowerName) {
        this.id = id;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.borrowerName = borrowerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getReturnDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public boolean isReturned() {
        return dueDate != null;
    }
}

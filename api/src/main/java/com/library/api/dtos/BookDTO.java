package com.library.api.dtos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookDTO {

    private Long id;
    private String isbn;
    private String title;
    private String author;

    private boolean isAvailable;
    private int totalLoans;
    private LocalDate lastLoanDate;

    private List<LoanDTO> loanHistory = new ArrayList<>();

    public BookDTO() {}

    public BookDTO(Long id, String isbn, String title, String author) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getTotalLoans() {
        return totalLoans;
    }

    public void setTotalLoans(int totalLoans) {
        this.totalLoans = totalLoans;
    }

    public LocalDate getLastLoanDate() {
        return lastLoanDate;
    }

    public void setLastLoanDate(LocalDate lastLoanDate) {
        this.lastLoanDate = lastLoanDate;
    }

    public List<LoanDTO> getLoanHistory() {
        return loanHistory;
    }

    public void setLoanHistory(List<LoanDTO> loanHistory) {
        this.loanHistory = loanHistory;
    }

    public String getDisplayTitle() {
        return title + " - " + author;
    }

    public String getAvailabilityStatus() {
        return isAvailable ? "Disponible" : "Emprunté";
    }
}
package com.library.api.entities;

import jakarta.persistence.*;

import java.awt.print.Book;
import java.time.LocalDate;

@Entity
@Table(name = "LOANS")
public class ELoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate loanDate;

    @Column(nullable = false)
    private LocalDate dueDate;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private EBook book;

    @ManyToOne
    @JoinColumn(name = "borrower_id", nullable = false)
    private EBorrower borrower;

    public Long getId() {
        return id;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public EBook getBook() {
        return book;
    }

    public EBorrower getBorrower() {
        return borrower;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setBook(EBook book) {
        this.book = book;
    }

    public void setBorrower(EBorrower borrower) {
        this.borrower = borrower;
    }
}

package com.library.api.service;

import com.library.api.dtos.BookDTO;
import com.library.api.dtos.LoanDTO;
import com.library.api.entities.EBook;
import com.library.api.entities.ELoan;
import com.library.api.repositories.BookRepository;
import com.library.api.repositories.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;
    private LoanRepository loanRepository;

    public BookService(
            BookRepository bookRepository,
            LoanRepository loanRepository
    ) {
        this.bookRepository = bookRepository;
        this.loanRepository = loanRepository;
    }

    public List<BookDTO> getAllBooks() {
        List<EBook> entityBooks = bookRepository.findAll();
        List<BookDTO> dtoBooks = new ArrayList<BookDTO>();

        entityBooks.forEach((entity) -> {
            BookDTO bookDTO = new BookDTO();
            bookDTO.setId(entity.getId());
            bookDTO.setIsbn(entity.getIsbn());
            bookDTO.setTitle(entity.getTitle());
            bookDTO.setAuthor(entity.getAuthor());
            dtoBooks.add(bookDTO);
        });
        return dtoBooks;
    }

    public void save(BookDTO bookDTO) {
        EBook entityBook = new EBook();
        entityBook.setIsbn(bookDTO.getIsbn());
        entityBook.setTitle(bookDTO.getTitle());
        entityBook.setAuthor(bookDTO.getAuthor());
        bookRepository.save(entityBook);
    }

    public List<LoanDTO> getLoanHistoryByIsbn(String isbn) {
        EBook book = bookRepository.findByIsbn(isbn);
        if (book == null) {
            return new ArrayList<>();
        }

        List<ELoan> loans = loanRepository.findByBookId(book.getId());
        List<LoanDTO> loanDTOs = new ArrayList<>();

        loans.forEach((loan) -> {
            LoanDTO loanDTO = new LoanDTO();
            loanDTO.setId(loan.getId());
            loanDTO.setLoanDate(loan.getLoanDate());
            loanDTO.setDueDate(loan.getDueDate());
            loanDTO.setBorrowerName(loan.getBorrower().getFirstName() + " " + loan.getBorrower().getLastName());
            loanDTOs.add(loanDTO);
        });

        return loanDTOs;
    }
}

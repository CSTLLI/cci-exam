package com.library.api.controllers;

import com.library.api.dtos.BookDTO;
import com.library.api.dtos.LoanDTO;
import com.library.api.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDTO> get() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public List<BookDTO> save(@RequestBody BookDTO bookDTO) {
        bookService.save(bookDTO);

        return bookService.getAllBooks();
    }

    @GetMapping("/{isbn}")
    public List<LoanDTO> getLoanHistoryByIsbn(@PathVariable String isbn) {
        return bookService.getLoanHistoryByIsbn(isbn);
    }
}
package com.library.api.repositories;

import com.library.api.entities.EBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<EBook, Long> {

    public EBook findByTitle(String title);
    public EBook findByIsbn(String isbn);
}

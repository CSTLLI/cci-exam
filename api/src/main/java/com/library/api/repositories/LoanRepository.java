package com.library.api.repositories;

import com.library.api.entities.ELoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<ELoan, Long> {

    public List<ELoan> findByBookId(Long bookId);
}

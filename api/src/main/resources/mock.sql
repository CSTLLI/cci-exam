-- Insertion des livres
INSERT INTO BOOKS (isbn, title, author) VALUES
                                            ('9782070360024', 'Le Petit Prince', 'Antoine de Saint-Exupéry'),
                                            ('9782070413119', '1984', 'George Orwell'),
                                            ('9782253004226', 'Le Seigneur des Anneaux', 'J.R.R. Tolkien'),
                                            ('9782070379248', 'L\'Étranger', 'Albert Camus'),
                                            ('9782253002864', "Harry Potter à l\'école des sorciers', 'J.K. Rowling');

-- Insertion des emprunteurs
INSERT INTO BORROWERS (first_name, last_name) VALUES
                                                  ('Jean', 'Dupont'),
                                                  ('Marie', 'Martin'),
                                                  ('Pierre', 'Durand');

-- Insertion des emprunts
INSERT INTO LOANS (loan_date, return_date, book_id, borrower_id) VALUES
                                                                     ('2025-06-15', '2025-06-15', 1, 1),
                                                                     ('2025-06-01', '2025-06-13', 2, 2),
                                                                     ('2025-06-20', '2025-06-10', 3, 3),
                                                                     ('2025-06-22', '2025-06-24', 3, 1);

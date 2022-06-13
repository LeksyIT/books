package com.leksy.books.service;

import com.leksy.books.dto.BookDTO;

public interface BookService {
    BookDTO appendBook(BookDTO bookDTO);
    BookDTO updateBook(Long id, BookDTO bookDTO);
    BookDTO deleteBook(Long id);
    BookDTO getBook(Long id);
}

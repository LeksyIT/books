package com.leksy.books.service.impl;

import com.leksy.books.dto.BookDTO;
import com.leksy.books.entity.Book;
import com.leksy.books.mapper.BookMapper;
import com.leksy.books.repository.BookRepository;
import com.leksy.books.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDTO appendBook(BookDTO bookDTO) {
        bookRepository.save(bookMapper.toBook(bookDTO));
        return bookDTO;
    }

    @Override
    public BookDTO updateBook(Long id, BookDTO bookDTO) {
        Book book = bookMapper.toBook(bookDTO);
        book.setId(id);
        return bookMapper.toBookDTO(bookRepository.save(book));
    }

    @Override
    public BookDTO deleteBook(Long id) {
        Book book = bookRepository.getReferenceById(id);
        bookRepository.deleteById(id);
        return bookMapper.toBookDTO(book);
    }

    @Override
    public BookDTO getBook(Long id) {
        Book book = bookRepository.getReferenceById(id);
        return bookMapper.toBookDTO(book);
    }
}

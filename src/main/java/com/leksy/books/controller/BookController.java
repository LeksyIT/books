package com.leksy.books.controller;

import com.leksy.books.dto.BookDTO;
import com.leksy.books.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
public class BookController {

    private final BookService bookService;

    @PostMapping
    public BookDTO appendBook(@RequestBody BookDTO bookDTO) {
        return bookService.appendBook(bookDTO);
    }

    @PutMapping
    public BookDTO updateBook(@RequestParam(value = "id") Long id, @RequestBody BookDTO bookDTO) {
        return bookService.updateBook(id, bookDTO);
    }

    @DeleteMapping
    public BookDTO deleteBook(@RequestParam(value = "id") Long id) {
        return bookService.deleteBook(id);
    }

    @GetMapping
    public BookDTO getBook(@RequestParam(value = "id") Long id) {
        return bookService.getBook(id);
    }
}

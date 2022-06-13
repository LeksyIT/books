package com.leksy.books.mapper;

import com.leksy.books.dto.BookDTO;
import com.leksy.books.entity.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toBook(BookDTO bookDTO);

    BookDTO toBookDTO(Book book);

    List<Book> toBook(List<BookDTO> bookDTOList);

    List<BookDTO> toBookDTO(List<Book> bookList);
}

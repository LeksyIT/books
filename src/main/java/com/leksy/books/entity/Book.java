package com.leksy.books.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book")
@Setter
@Getter
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author_name")
    private String authorName;

    @Column(name = "page_count")
    private Integer pageCount;

    @Column(name = "published_date")
    private Date publishedDate;

    @Column(name = "publication")
    private String publication;


}

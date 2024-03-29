package com.sas.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true, length = 13)
    private String isbn;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(name = "num_pages")
    private String numberOfPages;

    private Double price;

    @ManyToOne
    private Author author;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                ", price=" + price +
                '}';
    }
}

package com.jpa.exercies.domain.dto;

import com.jpa.exercies.domain.Book;
import com.jpa.exercies.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
    private Long bookId;
    private String bookName;
    private String authorName;
    private String publisherName;

    public static BookResponse of(Book book) {
        return BookResponse.builder()
                .bookId(book.getId())
                .bookName(book.getName())
                .authorName(book.getAuthor().getName())
                .publisherName(book.getPublisher().getName())
                .build();
    }
}

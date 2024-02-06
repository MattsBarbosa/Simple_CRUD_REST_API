package com.mattsbarbosa.books;

import com.mattsbarbosa.books.domain.Book;
import com.mattsbarbosa.books.domain.BookEntity;

public final class TestData {

    private TestData() {}

    public static Book testBook() {
        return Book.builder()
                .isbn("0266556")
                .author("Matts O")
                .title("My man")
                .build();
    }

    public static BookEntity testBookEntity() {
        return BookEntity.builder()
                .isbn("0266556")
                .author("Matts O")
                .title("My man")
                .build();
    }
}

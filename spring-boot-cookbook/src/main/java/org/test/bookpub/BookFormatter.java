package org.test.bookpub;

import org.springframework.expression.ParseException;
import org.springframework.format.Formatter;
import org.test.bookpub.entity.Book;
import org.test.bookpub.repository.BookRepository;

import java.util.Locale;

/**
 * Created by leandromaro on 23/5/17.
 */
public class BookFormatter implements Formatter<Book> {
    private BookRepository repository;
    public BookFormatter(BookRepository repository) {
        this.repository = repository;
    }
    @Override
    public Book parse(String bookIdentifier, Locale locale) throws
            ParseException {
        Book book = repository.findBookByIsbn(bookIdentifier);
        return book != null ? book :
                repository.findOne(Long.valueOf(bookIdentifier));
    }
    @Override
    public String print(Book book, Locale locale) {
        return book.getIsbn();
    }
}

package org.test.bookpub.isbn;

import org.springframework.stereotype.Component;

/**
 * Created by leandromaro on 21/5/17.
 */
@Component
public class Isbn {
    private String isbn;
    public Isbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    } }


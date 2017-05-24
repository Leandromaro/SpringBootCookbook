package org.test.bookpub;

import org.springframework.stereotype.Component;

/**
 * Created by leandromaro on 21/5/17.
 */
public class Isbn {
    private String isbn;
    public Isbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    } }


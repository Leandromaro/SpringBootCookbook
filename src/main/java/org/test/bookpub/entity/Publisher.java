package org.test.bookpub.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by leandromaro on 2/5/17.
 */
@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "publisher")
    private List<Book> books;
    protected Publisher() {}
    public Publisher(String name) {}
}
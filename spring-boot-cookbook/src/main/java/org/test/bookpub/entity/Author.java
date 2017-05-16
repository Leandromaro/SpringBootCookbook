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
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "author")
    private List<Book> books;
    protected Author() {}
    public Author(String firstName, String lastName) {}
    //Skipping implementation to save space, but we do need it all
}

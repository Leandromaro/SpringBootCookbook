package org.test.bookpub.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by leandromaro on 2/5/17.
 */
@Entity
public class Reviewer {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    protected Reviewer() {}
    public Reviewer(String firstName, String lastName) {
        //Skipping implementation to save space
    }
}
package org.test.bookpub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.bookpub.entity.Author;

/**
 * Created by leandro.maro on 08/05/17.
 *
 * The @RepositoryRestResource annotation, while optional, provides	us with	the	ability	to have	a
 * finer control over the exposure of the repository as	a web data service.
 @RepositoryRestResource creates a HATEOAS service with Spring JPA
 */
@RepositoryRestResource
public interface AuthorRepository extends PagingAndSortingRepository<Author,Long> {
}

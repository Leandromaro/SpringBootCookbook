package org.test.bookpub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.bookpub.entity.Publisher;

/**
 * Created by leandro.maro on 08/05/17.
 *
 * PagingAndSortingRepository is an extension of CrudRepository to provide additional methods to retrieve entities using the pagination and sorting abstraction.
 * The @RepositoryRestResource annotation,
 * provides us with the ability to have a finer control over
 * the exposure of the repository as a web data service.
 *
 * Provides us HATOAS
 */

@RepositoryRestResource
public interface PublisherRepository extends PagingAndSortingRepository<Publisher,Long> {
}

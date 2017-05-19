package org.test.bookpub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.bookpub.entity.Reviewer;

/**
 * Created by leandro.maro on 08/05/17.
 */
@RepositoryRestResource
public	interface	ReviewerRepository	extends PagingAndSortingRepository<Reviewer,	Long> {
}

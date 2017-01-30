package com.iqmsoft.openshift.spring.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.iqmsoft.openshift.spring.model.Person;

import java.util.List;

@RepositoryRestResource(path = "people", collectionResourceRel = "person", itemResourceRel = "person")
public interface PeopleRepository extends PagingAndSortingRepository<Person, Integer> {
    @RestResource(path = "byLastName")
    List<Person> findByLastName(@Param("lastName") String lastName);
    @RestResource(path = "byFirstName")
    List<Person> findByFirstName(@Param("firstName") String firstName);
    @RestResource(path = "byCity")
    List<Person> findByCity(@Param("city") String city);
    @RestResource(path = "byTelephone")
    List<Person> findByTelephone(@Param("telephone") String telephone);
}


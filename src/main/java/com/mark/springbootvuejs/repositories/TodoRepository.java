package com.mark.springbootvuejs.repositories;

import com.mark.springbootvuejs.domain.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TodoRepository extends CrudRepository<Todo, Long> { }

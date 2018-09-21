package me3x;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface PartRepo extends JpaRepository<Part, Long>, QuerydslPredicateExecutor {



}

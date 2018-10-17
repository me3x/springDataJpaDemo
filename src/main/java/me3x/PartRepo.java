package me3x;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

@RepositoryRestResource(path = "/participants")
public interface PartRepo extends CrudRepository<Part, Long> {

    @RestResource(description = @Description("find all participants with roles"))
    Collection<PartRoleProjection> findBy();

    @RestResource(description = @Description("find all participants with name"))
    Collection<PartRoleProjection> findByName(@Param("name") String name);

}

package me3x;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

@RepositoryRestResource(path = "/roles")
public interface RoleRepo extends CrudRepository<Role, Long> {

    @RestResource(description = @Description("find all roles with part"))
    Collection<RolePartProjection> findBy();

}

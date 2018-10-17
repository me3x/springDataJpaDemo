package me3x;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class RoleController {

    @Autowired
    RoleRepo roleRepo;

    @GetMapping("role")
    public List<Role> findAll() {
//        Iterable<PartRoleProjection> parts = partRepo.findAll(predicate);
        Iterable<Role> roles = roleRepo.findAll();
        return StreamSupport.stream(roles.spliterator(), false).collect(Collectors.toList());
    }

    @GetMapping("role-part")
    public List<RolePartProjection> findRolePart() {
//        Iterable<PartRoleProjection> parts = partRepo.findAll(predicate);
        Iterable<RolePartProjection> roles = roleRepo.findBy();
        return StreamSupport.stream(roles.spliterator(), false).collect(Collectors.toList());
    }

}

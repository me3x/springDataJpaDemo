package me3x;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class PartController {

    @Autowired
    PartRepo partRepo;

    @GetMapping("part")
    public PartRoleProjection findFirst() {
        Iterable<PartRoleProjection> parts = partRepo.findBy();
        return StreamSupport.stream(parts.spliterator(), false).findAny().get();
    }

    @GetMapping("parts")
    public List<PartRoleProjection> findAll() {
//        Iterable<PartRoleProjection> parts = partRepo.findAll(predicate);
        Iterable<PartRoleProjection> parts = partRepo.findBy();
        return StreamSupport.stream(parts.spliterator(), false).collect(Collectors.toList());
    }

}

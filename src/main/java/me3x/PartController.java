package me3x;

import com.querydsl.core.types.Predicate;
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
    public List<Part> findAll(Predicate predicate) {
        Iterable<Part> parts = partRepo.findAll(predicate);
        return StreamSupport.stream(parts.spliterator(), false).collect(Collectors.toList());
    }

}

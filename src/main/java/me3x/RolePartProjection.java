package me3x;

import org.springframework.beans.factory.annotation.Value;

interface RolePartProjection {

    @Value("#{target.part.name}")
    String getPartName();

    String getFunction();

}

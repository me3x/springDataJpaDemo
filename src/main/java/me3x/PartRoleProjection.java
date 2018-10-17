package me3x;

import org.springframework.beans.factory.annotation.Value;

interface PartRoleProjection {

    @Value("#{target.roles[0].function}")
    String getRoleFunction();

}

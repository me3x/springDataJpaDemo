package me3x;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Part {

    @Id
    @GeneratedValue
    Long id;

    @Column
    String name;

    @Column
    String code;
}

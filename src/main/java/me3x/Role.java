package me3x;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String function;

    @ManyToOne
    @JoinColumn(name = "PART_ID")
    private Part part;
}

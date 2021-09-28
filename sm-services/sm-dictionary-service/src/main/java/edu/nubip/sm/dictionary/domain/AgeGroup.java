package edu.nubip.sm.dictionary.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "age_group")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AgeGroup implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "from")
    private int from;
    @Column(name = "to")
    private int to;
    @Column(name = "name")
    private String name;
}

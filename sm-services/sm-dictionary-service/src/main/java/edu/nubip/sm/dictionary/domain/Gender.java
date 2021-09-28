package edu.nubip.sm.dictionary.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "gender")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Gender implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name", unique = true)
    private String name;
}

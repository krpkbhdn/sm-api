package edu.nubip.sm.food.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ingredient")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name", length = 1024)
    private String name;
}

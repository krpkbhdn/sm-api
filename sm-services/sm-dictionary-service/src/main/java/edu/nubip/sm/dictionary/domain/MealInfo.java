package edu.nubip.sm.dictionary.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "meal_info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MealInfo implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "calories")
    private int calories;
    @Column(name = "permissible_deviation")
    private int permissibleDeviation;

    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "age_group_id")
    private AgeGroup ageGroup;

    @ManyToOne
    @JoinColumn(name = "eating_time_id")
    private EatingTime eatingTime;
}

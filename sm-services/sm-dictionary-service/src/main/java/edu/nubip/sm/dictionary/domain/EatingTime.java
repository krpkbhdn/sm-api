package edu.nubip.sm.dictionary.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "eating_time")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EatingTime implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "hour", column = @Column(name = "from_hour")),
            @AttributeOverride(name = "minutes", column = @Column(name = "from_minutes"))
    })
    private HourMinutes from;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "hour", column = @Column(name = "to_hour")),
            @AttributeOverride(name = "minutes", column = @Column(name = "to_minutes"))
    })
    private HourMinutes to;

    @Column(name = "name")
    private String name;
}

package edu.nubip.sm.dictionary.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "place")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Place implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", length = 1024)
    private String name;
    @ManyToOne
    @JoinColumn(name = "place_type_id")
    private PlaceType placeType;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
}

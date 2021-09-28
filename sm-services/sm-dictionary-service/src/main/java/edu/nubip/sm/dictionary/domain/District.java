package edu.nubip.sm.dictionary.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "district")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class District implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 1024)
    private String name;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}

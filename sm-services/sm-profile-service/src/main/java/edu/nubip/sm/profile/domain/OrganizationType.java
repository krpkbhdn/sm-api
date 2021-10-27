package edu.nubip.sm.profile.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "organization_type")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrganizationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
}

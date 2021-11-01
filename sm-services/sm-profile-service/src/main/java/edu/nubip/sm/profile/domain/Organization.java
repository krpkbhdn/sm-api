package edu.nubip.sm.profile.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "organization")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "placeId", column = @Column(name = "place_id")),
            @AttributeOverride(name = "street", column = @Column(name = "street")),
            @AttributeOverride(name = "house", column = @Column(name = "house"))
    })
    private Address address;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private OrganizationType type;
}

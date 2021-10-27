package edu.nubip.sm.profile.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_profile")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserProfile {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "surname")
    private String surname;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "position")
    private String position;
    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
}

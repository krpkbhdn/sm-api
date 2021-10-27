package edu.nubip.sm.profile.domain;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    private long placeId;
    private String street;
    private String house;
}

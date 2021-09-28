package edu.nubip.sm.dictionary.domain;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class HourMinutes {
    private int hour;
    private int minutes;
}

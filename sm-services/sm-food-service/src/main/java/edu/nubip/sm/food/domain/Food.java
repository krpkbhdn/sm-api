package edu.nubip.sm.food.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "food")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "recipe", length = 16384)
    private String recipe;
    @Column(name = "weight")
    private int weight;
    @Column(name = "calories")
    private int calories;
    @Column(name = "photo_url", length = 4096)
    private String photoUrl;
    @Column(name = "description", length = 8192)
    private String description;

    @ManyToMany
    @JoinTable(name = "food_ingredient",
            joinColumns = @JoinColumn(name = "food_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    List<Ingredient> ingredients;
}

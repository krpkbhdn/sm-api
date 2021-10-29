package edu.nubip.sm.food.web;

import edu.nubip.sm.food.domain.Ingredient;
import edu.nubip.sm.food.service.IngredientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ingredient")
public class IngredientRestController extends AbstractRestController<Ingredient, Long, IngredientService> {

    public IngredientRestController(IngredientService ingredientService) {
        super(ingredientService);
    }
}

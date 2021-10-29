package edu.nubip.sm.food.web;

import edu.nubip.sm.food.domain.Food;
import edu.nubip.sm.food.service.FoodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/food")
public class FoodRestController extends AbstractRestController<Food, Long, FoodService>{

    public FoodRestController(FoodService foodService) {
        super(foodService);
    }
}

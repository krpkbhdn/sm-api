package edu.nubip.sm.dictionary.web;

import edu.nubip.sm.dictionary.domain.MealInfo;
import edu.nubip.sm.dictionary.service.MealInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dictionary/api/v1/meal-info")
public class MealInfoRestController extends AbstractRestController<MealInfo, Integer, MealInfoService> {

    public MealInfoRestController(MealInfoService service) {
        super(service);
    }
}

package edu.nubip.sm.dictionary.web;

import edu.nubip.sm.dictionary.domain.Gender;
import edu.nubip.sm.dictionary.service.GenderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dictionary/api/v1/gender")
public class GenderRestController extends AbstractRestController<Gender, Integer, GenderService> {

    public GenderRestController(GenderService service) {
        super(service);
    }
}

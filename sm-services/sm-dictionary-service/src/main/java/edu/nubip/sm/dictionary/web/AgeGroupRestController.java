package edu.nubip.sm.dictionary.web;

import edu.nubip.sm.dictionary.domain.AgeGroup;
import edu.nubip.sm.dictionary.service.AgeGroupService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dictionary/api/v1/age-group")
public class AgeGroupRestController extends AbstractRestController<AgeGroup, Integer, AgeGroupService> {

    public AgeGroupRestController(AgeGroupService service) {
        super(service);
    }
}

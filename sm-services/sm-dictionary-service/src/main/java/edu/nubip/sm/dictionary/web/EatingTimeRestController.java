package edu.nubip.sm.dictionary.web;

import edu.nubip.sm.dictionary.domain.EatingTime;
import edu.nubip.sm.dictionary.service.EatingTimeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dictionary/api/v1/eating-time")
public class EatingTimeRestController extends AbstractRestController<EatingTime, Integer, EatingTimeService> {

    public EatingTimeRestController(EatingTimeService service) {
        super(service);
    }
}

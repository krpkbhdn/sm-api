package edu.nubip.sm.dictionary.web;

import edu.nubip.sm.dictionary.domain.District;
import edu.nubip.sm.dictionary.service.DistrictService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dictionary/api/v1/district")
public class DistrictRestController extends AbstractRestController<District, Integer, DistrictService> {

    public DistrictRestController(DistrictService service) {
        super(service);
    }
}

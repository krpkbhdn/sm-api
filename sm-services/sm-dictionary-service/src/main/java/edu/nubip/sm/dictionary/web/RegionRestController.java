package edu.nubip.sm.dictionary.web;

import edu.nubip.sm.dictionary.domain.Region;
import edu.nubip.sm.dictionary.service.RegionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/region")
public class RegionRestController extends AbstractRestController<Region, Integer, RegionService> {

    public RegionRestController(RegionService service) {
        super(service);
    }

}

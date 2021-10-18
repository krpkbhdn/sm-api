package edu.nubip.sm.dictionary.web;

import edu.nubip.sm.dictionary.domain.PlaceType;
import edu.nubip.sm.dictionary.service.PlaceTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/place-type")
public class PlaceTypeRestController extends AbstractRestController<PlaceType, Integer, PlaceTypeService> {

    public PlaceTypeRestController(PlaceTypeService service) {
        super(service);
    }
}

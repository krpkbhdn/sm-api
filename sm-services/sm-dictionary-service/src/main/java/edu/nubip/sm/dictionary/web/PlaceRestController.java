package edu.nubip.sm.dictionary.web;

import edu.nubip.sm.dictionary.domain.Place;
import edu.nubip.sm.dictionary.service.PlaceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/place")
public class PlaceRestController extends AbstractRestController<Place, Long, PlaceService> {

    public PlaceRestController(PlaceService service) {
        super(service);
    }
}

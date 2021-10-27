package edu.nubip.sm.profile.web;

import edu.nubip.sm.profile.domain.Organization;
import edu.nubip.sm.profile.service.OrganizationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/organization")
public class OrganizationRestController extends AbstractRestController<Organization, Long, OrganizationService> {

    public OrganizationRestController(OrganizationService service) {
        super(service);
    }
}

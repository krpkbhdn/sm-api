package edu.nubip.sm.profile.web;

import edu.nubip.sm.profile.domain.OrganizationType;
import edu.nubip.sm.profile.service.OrganizationTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/organization-type")
public class OrganizationTypeRestController extends AbstractRestController<OrganizationType, Integer, OrganizationTypeService> {

    public OrganizationTypeRestController(OrganizationTypeService service) {
        super(service);
    }
}

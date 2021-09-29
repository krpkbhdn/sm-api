package edu.nubip.sm.dictionary.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dictionary/api/v1")
public class RegionRestController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

}

package com.example.SpringBootResourceServer.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/v1/authenticate")
    public String authenticate() {
        return "protected resource";
    }

    @GetMapping("/v1/permit")
    public String permit() {
        return "permitted resource";
    }

}

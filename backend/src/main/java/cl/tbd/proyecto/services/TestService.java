package cl.tbd.proyecto.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {
    @GetMapping("/hello")
    public String test() {
        return "Hello World";
    }
}
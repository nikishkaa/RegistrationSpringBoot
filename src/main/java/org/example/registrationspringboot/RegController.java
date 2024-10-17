package org.example.registrationspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class RegController {
    @GetMapping("/reg")
    public String loginPage() {
        return "registration-form";
    }
}

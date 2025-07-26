package springsecurity.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringBootFormBasedAuthenticationController {

	@GetMapping("/")
    public String greeting() {
        return "success";
    }
}

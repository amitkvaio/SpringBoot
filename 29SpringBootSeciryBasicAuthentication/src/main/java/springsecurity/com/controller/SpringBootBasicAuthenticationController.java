package springsecurity.com.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootBasicAuthenticationController {

	public SpringBootBasicAuthenticationController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/greeting")
    public String greeting(Authentication authentication) {
		String userName = authentication.getName();  // ✅ Correct method
        return "Spring Security In-memory Authentication Example - Welcome " + userName ;
    }
}

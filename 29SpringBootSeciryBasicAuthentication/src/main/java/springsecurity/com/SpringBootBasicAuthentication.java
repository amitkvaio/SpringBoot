package springsecurity.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicAuthentication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicAuthentication.class, args);
		System.out.println("************SpringBootBasicAuthentication has started successfully*****************");
	}
}

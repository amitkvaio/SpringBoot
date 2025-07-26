package springsecurity.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity  // Required to configure HttpSecurity correctly
public class SpringSecurityConfig {

    @Bean
    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
	/*
	Using PasswordEncoder to encode the password. 
	Spring Security’s PasswordEncoder interface is used to perform a one-way transformation of a password 
		to let the password be stored securely. 
	We are using BCryptPasswordEncoder class which implements the PasswordEncoder interface. 
	The BCryptPasswordEncoder class implementation uses the widely supported bcrypt algorithm to hash the passwords.
	
	*/
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // ✅ Modern way to disable CSRF
            .authorizeHttpRequests(authz -> authz
                .anyRequest().authenticated()
            )
            .formLogin(Customizer.withDefaults());
        return http.build();
    }

    
    /*
     
    When Should You Disable CSRF?
	*******************************
	We should only disable CSRF in these cases:
    We are building a stateless REST API using HTTP Basic or JWT.
    We are not using HTML forms (e.g., no browser-based form login).
	If our app uses form-based login with sessions, it's not recommended to disable CSRF. 
     
    */
    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails ramesh = User.builder()
                .username("amit")
                .password(passwordEncoder().encode("password"))
                .roles("USER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(ramesh, admin);
    }
}


/*
By default, Spring Security enables both form-based and HTTP basic authentication. 
Here we are using httpBasic() element to define only Basic Authentication inside the SecurityFilterChain bean.

Spring Security’s InMemoryUserDetailsManager implements UserDetailsService to provide support 
	for username/password-based authentication that is stored in memory.
*/

/*
Username/Password Authentication (In-memory Authentication)
In-Memory Authentication means that user details (username, password, roles) 
	are hardcoded in the application, not stored in a database or external system.
	
It's mainly used for:
•	Testing
•	Learning/demo purposes
•	Small internal apps with limited user

*/



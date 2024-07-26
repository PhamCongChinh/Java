package com.blog.it.user;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class UserController {

	@GetMapping("user")
	public String name() {
		return "Pham Cong Chinh";
	}
	
	@PostMapping("register")
	public ResponseEntity<Void> register(@RequestBody User user) {
		System.out.println(user);
		return ResponseEntity.ok().build();
	}
	
}

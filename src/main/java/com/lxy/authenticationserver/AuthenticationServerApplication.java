package com.lxy.authenticationserver;

import com.lxy.authenticationserver.oauth2config.config.annotation.EnableAuthJWTTokenStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAuthJWTTokenStore    // 使用 JWT 存储令牌
public class AuthenticationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationServerApplication.class, args);
	}

}

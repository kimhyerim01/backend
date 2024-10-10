package com.tourarea.kakao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.securityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    // 스프링 시큐리티 설정 메소드
    @Bean
    public securityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        // OAuth 로그인 설정
        https.oauth2Login(login -> login
                                    .loginPage("/login")
                        );

        return http.build();
    }

}

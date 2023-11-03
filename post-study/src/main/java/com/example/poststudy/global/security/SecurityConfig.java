package com.example.poststudy.global.security;

import com.example.poststudy.global.security.exception.handler.AuthenticationEntryPointImpl;
import com.example.poststudy.global.security.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
@RequiredArgsConstructor
public class SecurityConfig extends SecurityConfigurerAdapter {

    private final JwtProvider jwtProvider;
    private final AuthenticationEntryPointImpl authenticationEntryPoint;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception{
        return http
                .authorizeRequests()
                .requestMatchers("/user/*").permitAll()
                .requestMatchers("/post/search", "/post/postImage/*").permitAll()
                .requestMatchers(HttpMethod.GET, "/post").permitAll()
                .requestMatchers(HttpMethod.GET, "/user").authenticated()
                .anyRequest().authenticated()

                .and()
                .apply(new FilterConfig(jwtProvider))
                .and().build();

    }

}

package com.in28minutes.rest.webservices.restfulwebservices.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BasicAuthenticationSecurityConfiguration {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return
            http
                .authorizeHttpRequests(œ
                  auth -> auth
                          .mvcMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                          .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(
                    session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                .csrf().disable()
                .build();
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        List<Integer> c = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            Boolean sameValue = false;
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]) sameValue=true;
            }
            if(!sameValue) c.add(a[i]);
        }
        return a;
    }

}

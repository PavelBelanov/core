package ru.belanov.core.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {



    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()
                    .withUser("user")
                    .password("{noop}password")
                    .roles("USER")
                    .and()
                    .withUser("admin")
                    .password("{noop}password")
                    .roles("USER","ADMIN");



    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeHttpRequests()
                .antMatchers("/users/**").hasAnyRole("USER")
                .antMatchers("/cards/**").hasRole("USER")
                .and().csrf()
                .disable()
                .formLogin().disable();
    }
}

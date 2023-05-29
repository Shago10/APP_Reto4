/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Security;




import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.web.bind.annotation.RestController;

/* 
*
 * @author santi
 */


@RestController
    @EnableWebSecurity
public class SecurityAdapter extends WebSecurityConfigurerAdapter {
   @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(
                a -> a.antMatchers("/", "/error", "/webjars/**").permitAll().anyRequest().authenticated()
                ).exceptionHandling(
                       e -> e.authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.FORBIDDEN))
            ).oauth2Login().defaultSuccessUrl("/static/homePage.html", true);
         
            http.cors().and().csrf().disable();
              
        
    }

}

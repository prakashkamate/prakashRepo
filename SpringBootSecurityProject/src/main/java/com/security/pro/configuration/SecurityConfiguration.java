package com.security.pro.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override			
	protected void configure(HttpSecurity http) throws Exception
				{
					System.out.println("Start-----Security");
					http.csrf().disable().authorizeRequests().and().formLogin().loginPage("/login").permitAll();
					System.out.println("End----Security");
				}

}

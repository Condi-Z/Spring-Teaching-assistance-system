package com.condi.controller;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class CondiSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource mydatasource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		UserBuilder user = User.withDefaultPasswordEncoder();
//		auth.inMemoryAuthentication()
//		.withUser(user.username("condi").password("123").roles("Admin"))
//		.withUser(user.username("student").password("123").roles("Student"))
//		.withUser(user.username("teacher").password("123").roles("Teacher"));
		auth.jdbcAuthentication().dataSource(mydatasource);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.anyRequest().authenticated()
//		.antMatchers("/").hasRole("Student")
//		.antMatchers("/").hasRole("Teacher")
//		.antMatchers("/").hasRole("Admin")
//		.antMatchers("/Condiapp/Student/**").hasRole("Student")
//		.antMatchers("/Condiapp/Teacher/**").hasRole("Teacher")
//		.antMatchers("/Condiapp/Log/**").hasRole("Admin")
		.and()
		.formLogin()
		.loginPage("/showMyLoginPage")
		.loginProcessingUrl("/checkTheUser").permitAll()
		.and()
		.logout().permitAll();
	}
}

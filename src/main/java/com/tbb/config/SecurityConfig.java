package com.tbb.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.RememberMeAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.savedrequest.NullRequestCache;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Autowired 
//	private UserDetailsServiceImpl userDetailsServiceImpl;
//	@Autowired 
//	private CustomTokenBasedRememberMeService tokenBasedRememberMeService;
//	@Autowired 
//	private RememberMeAuthenticationProvider rememberMeAuthenticationProvider;
	
	@Autowired
	DataSource dataSource;

	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Autowired 
	MyUserDetailsService userDetails;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
			throws Exception {
		
		auth.userDetailsService(userDetails);

//		auth.jdbcAuthentication()
//				.dataSource(dataSource)
//				.passwordEncoder(encoder)
//				.usersByUsernameQuery(
//						"select username,password,enabled from users where username=?")
//				.authoritiesByUsernameQuery(
//						"select username, role from user_roles where username=?");
		
		//auth.jdbcAuthentication().dataSource(dataSource);
//		if(sh.getLoggedInUser().getEnabled()) {
//			.withUser(sh.getLoggedInUser().getUsername()).password(sh.getLoggedInUser().getPassword()).;
//		}
//		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//System.out.println("spring security");
//			 http
//	         .authorizeRequests()
//	             .anyRequest().authenticated()
//	             .and()
//	         .requestCache()
//	             .requestCache(new NullRequestCache())
//	             .and()
//	         .httpBasic();

		http.authorizeRequests()//.antMatchers("/feed/**").hasAnyRole("USER")
		.antMatchers("/**").permitAll();
//		.and()
//		.formLogin().loginPage("/loginRedirect").permitAll();
		
		http.csrf().disable();
//				.antMatchers("/login*").permitAll().antMatchers("/**")
//				.hasAnyRole("EMPLOYEE", "USER")
//
//				.anyRequest().authenticated().and().formLogin()
//				.loginPage("/login").usernameParameter("username")
//				.passwordParameter("password").loginProcessingUrl("/doLogin")
//				.defaultSuccessUrl("/index", true).failureUrl("/accessDenied")
//				.permitAll().and().exceptionHandling()
//				.accessDeniedPage("/accessDenied").and().logout()
//				.logoutUrl("/logout").logoutSuccessUrl("/login").permitAll();
//		http.authorizeRequests()
//		.antMatchers("/login*").permitAll();
//		.anyRequest().authenticated().and().formLogin()
//		.loginPage("/login").usernameParameter("username")
//		.passwordParameter("password").loginProcessingUrl("/doLogin")
//		.defaultSuccessUrl("/index", true).failureUrl("/accessDenied")
//		.permitAll().and().exceptionHandling()
//		.accessDeniedPage("/accessDenied").and().logout()
//		.logoutUrl("/logout").logoutSuccessUrl("/login").permitAll();
	}
//	 @Override protected void registerAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//		 auth
//		 	.userDetailsService(userDetailsServiceImpl)
//		 	.passwordEncoder(bCryptPasswordEncoder());
//		 auth.authenticationProvider(rememberMeAuthenticationProvider);
//	 }
}

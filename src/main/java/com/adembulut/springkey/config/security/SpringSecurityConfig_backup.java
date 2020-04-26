//package com.adembulut.springkey.config.security;
//
//import com.adembulut.springkey.config.security.handler.CustomAccessDeniedHandler;
//import com.adembulut.springkey.config.security.handler.CustomAuthenticationFailureHandler;
//import com.adembulut.springkey.config.security.handler.CustomLogoutSuccessHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
///**
// * @author adem.bulut  on  26.04.2020
// * @project springkey
// */
//@Configuration
//@EnableWebSecurity(debug = true)
//public class SpringSecurityConfig_backup extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("user1").password(passwordEncoder().encode("user1")).roles("USER")
//                .and()
//                .withUser("user2").password(passwordEncoder().encode("user2")).roles("USER")
//                .and()
//                .withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
//    }
//
//    @Override
//    protected void configure(final HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers("/user/**").hasRole("USER")
//                .antMatchers("/anonymous*").permitAll()
//                .antMatchers("/**").permitAll()
//                .antMatchers("/login*").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .loginProcessingUrl("/perform_login")
//                .defaultSuccessUrl("/index", true)
//                //.failureUrl("/login.html?error=true")
//                .failureHandler(customAuthenticationFailureHandler())
//                .and()
//                .logout()
//                .logoutUrl("/perform_logout")
//                .deleteCookies("JSESSIONID")
//                .logoutSuccessHandler(customLogoutSuccessHandler());
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public CustomAccessDeniedHandler customAccessDeniedHandler(){
//        return new CustomAccessDeniedHandler();
//    }
//
//    @Bean
//    public CustomAuthenticationFailureHandler customAuthenticationFailureHandler(){
//        return new CustomAuthenticationFailureHandler();
//    }
//
//    @Bean
//    public CustomLogoutSuccessHandler customLogoutSuccessHandler(){
//        return new CustomLogoutSuccessHandler();
//    }
//
//}

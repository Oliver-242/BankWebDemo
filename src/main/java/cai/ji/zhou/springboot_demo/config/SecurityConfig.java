//package cai.ji.zhou.springboot_demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/homo").authenticated() // 限制 /welcome 路径需要认证
//                .antMatchers("/login").permitAll()
//                .anyRequest().permitAll() // 允许其他请求
//                .and()
//                .formLogin()
//                .loginPage("/login") // 登录页面
//                .defaultSuccessUrl("/homo") // 登录成功后跳转的页面
//                .and()
//                .logout()
//                .logoutSuccessUrl("/")
//                .and()
//                .csrf().disable();
//    }
//}
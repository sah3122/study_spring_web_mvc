package me.study.springwebmvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
// 스프링 MVC 커스터마이징 방법
// application.properties
//@Configuration + @EnableWebMvc + implements WebMvcConfigurer 스프링 부트의 스프링 MVC 자동설정을 사용하지 않음
//@Configuration + implements WebMvcConfigurer 스프링 부트의 스프링 MVC 자동설정 + 추가 설정
public class WebConfig implements WebMvcConfigurer {

}

package com.canis.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.canis")
public class CanisConfiguration {
     
 
}

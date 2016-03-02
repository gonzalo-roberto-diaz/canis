package com.canis.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Gonzalo on 2/29/2016.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.canis.dao", "com.canis.service"})
public class ServiceConfig {
}


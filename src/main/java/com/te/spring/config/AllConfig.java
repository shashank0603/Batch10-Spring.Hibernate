package com.te.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({MovieConfig.class,ActorConfig.class})
@Configuration
public class AllConfig {

}

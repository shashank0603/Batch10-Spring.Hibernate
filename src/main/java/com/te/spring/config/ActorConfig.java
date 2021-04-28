package com.te.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.hibernate.movie.Actor;
@Configuration
public class ActorConfig {
	@Bean
	public Actor getActor() {
		Actor actor = new Actor();
		actor.setAct_id(1);
		actor.setAct_name("Punith");
		return actor;
		
	}
}

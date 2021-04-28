package com.te.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.te.hibernate.movie.Movie;

@Configuration
public class MovieConfig {
	@Bean
	public Movie getMovie() {
		Movie movie = new Movie();
		movie.setId(101);
		movie.setName("Yuvarathna");
		return movie;
	}

}

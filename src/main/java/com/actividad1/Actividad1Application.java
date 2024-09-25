package com.actividad1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Luis M. Pacheco
 */

@SpringBootApplication
@EntityScan("com.entidades")
@EnableJpaRepositories("com.repositorios")
@ComponentScan(basePackages={"com.controladores"})
public class Actividad1Application {

	public static void main(String[] args) {
		SpringApplication.run(Actividad1Application.class, args);
	}

}

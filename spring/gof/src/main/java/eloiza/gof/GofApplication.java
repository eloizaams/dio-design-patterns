package eloiza.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Projeto Spring Boot gerado via Spring Initizalizr
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring WEB
 * - H2 Database
 * - OpenFeign
 * - OpenAI
 */
@EnableFeignClients
@SpringBootApplication
public class GofApplication {

	public static void main(String[] args) {
		SpringApplication.run(GofApplication.class, args);
	}

}

package it.softwareindustriale.devopsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Applicazione di esempio del corso "DevOps per Junior".
 *
 * <p>Non c'e' alcun controller scritto a mano: l'endpoint {@code /health} e'
 * fornito da Spring Boot Actuator. La configurazione (base path "/" e
 * dettagli health) e' in {@code src/main/resources/application.properties}.
 */
@SpringBootApplication
public class DevopsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsAppApplication.class, args);
	}

}

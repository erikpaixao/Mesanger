package br.e3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.e3.util.AppContext;

@SpringBootApplication
public class MesangerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppContext.class, args);
	}
	
}

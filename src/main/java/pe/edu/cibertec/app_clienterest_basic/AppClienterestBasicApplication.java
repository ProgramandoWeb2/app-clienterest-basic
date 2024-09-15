package pe.edu.cibertec.app_clienterest_basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppClienterestBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppClienterestBasicApplication.class, args);
	}

}

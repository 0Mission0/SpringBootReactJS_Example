package idv.mission.example.SpringBootReactJS_Example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootReactJS_Example extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootReactJS_Example.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootReactJS_Example.class, args);
	}

}

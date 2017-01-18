package demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import demo.domain.SmartEntity;
import demo.domain.Users;
import demo.service.TeamService;
/*
 * used when run as a JAR
 */
@SpringBootApplication(scanBasePackages = {"demo"})
public class MicroserviceBootApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBootApplication.class, args);
	}
/*
 * used when run as a WAR
 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroserviceBootApplication.class);
	}
	
	
	
}

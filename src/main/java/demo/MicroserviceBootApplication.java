package demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.context.embedded.ServletContextInitializer;

import demo.domain.SmartEntity;
import demo.domain.Users;
import demo.service.TeamService;
/*
 * used when run as a JAR
 */
@SuppressWarnings("deprecation")
@SpringBootApplication(scanBasePackages = {"demo"})
public class MicroserviceBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBootApplication.class, args);
	}
/*
 * used when run as a WAR
 */
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroserviceBootApplication.class);
	}
	//@Override
//	public void onStartup(ServletContext arg0) throws ServletException {
//		// TODO Auto-generated method stub
//		
//	}
//	
	
	
}

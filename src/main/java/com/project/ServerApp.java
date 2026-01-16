package com.project;

import org.hibernate.cfg.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootApplication(scanBasePackages = {"com.project"})
@EnableJpaRepositories
public class ServerApp {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ServerApp.class);
        app.run(args);
    }/*
    	@Bean
        ApplicationRunner h2Reporter(Environment env, DataSource dataSource) {
 		return args -> {
 			String url = "<unknown>";
 			try (Connection c = dataSource.getConnection()) {
 				url = c.getMetaData().getURL();
 			} catch (Exception ignored) {}
 
 			boolean isH2 = url != null && url.startsWith("jdbc:h2");
 			String port = env.getProperty("server.port", "8090");
 			String ctx  = env.getProperty("server.servlet.context-path", "");
 			boolean h2Console = Boolean.parseBoolean(
 					env.getProperty("spring.h2.console.enabled", "false")
 			);
 			String h2Path = env.getProperty("spring.h2.console.path", "/h2");
 
 			if (isH2) {
 				System.out.println("=== H2 ACTIVE ===================================================");
 				System.out.println("H2 JDBC URL: " + url);
 				System.out.println("H2 username: " + env.getProperty("spring.datasource.username", "sa"));
 				System.out.println("H2 password: " + env.getProperty("spring.datasource.password", ""));
 				if (h2Console) {
 					System.out.println("H2 console:  http: localhost:" + port + ctx + h2Path);
 					System.out.println("Tip: In the console, set JDBC URL to the value above.");
 				}
 				System.out.println("================================================================");
 			} else {
 				System.out.println("[DataSource] Connected to: " + url);
 			}
 		};
 	}
 	*/
}

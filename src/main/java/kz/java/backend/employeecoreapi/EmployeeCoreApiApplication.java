package kz.java.backend.employeecoreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmployeeCoreApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeCoreApiApplication.class, args);
    }

}

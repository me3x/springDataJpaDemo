package me3x;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@EnableSpringDataWebSupport
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        Main.main(args);
        SpringApplication.run(Application.class, args);
    }

}

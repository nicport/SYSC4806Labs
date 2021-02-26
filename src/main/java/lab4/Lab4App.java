package lab4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab4App {
    private static final Logger log = LoggerFactory.getLogger(Lab4App.class);

    public static void main(String[] args) {
        SpringApplication.run(Lab4App.class, args);
    }


}

package org.example.dbadapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.example")
public class DbAdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbAdapterApplication.class, args);
    }

}

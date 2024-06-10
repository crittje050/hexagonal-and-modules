package org.example.restadapter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import port.input.CreateOrderPort;
import port.output.DatabasePort;
import service.CreateOrderUseCase;

@Configuration
public class ServiceBinding {

    @Bean
    public CreateOrderPort createOrderPort(DatabasePort databasePort) {
        return new CreateOrderUseCase(databasePort);
    }

}

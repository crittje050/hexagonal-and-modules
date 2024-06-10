package service;

import domain.Order;
import port.input.CreateOrderPort;
import port.output.DatabasePort;

public class CreateOrderUseCase implements CreateOrderPort {

    private final DatabasePort databasePort;

    public CreateOrderUseCase(DatabasePort databasePort) {
        this.databasePort = databasePort;
    }

    @Override
    public void create(Order order) {
        databasePort.persistCreateOrder(order);

    }
}

package org.example.dbadapter.adapter;

import domain.Order;
import org.example.dbadapter.repository.OrderRepository;
import org.springframework.stereotype.Component;
import port.output.DatabasePort;

@Component
public class DatabaseAdapter implements DatabasePort {

    private final OrderRepository orderRepository;

    public DatabaseAdapter(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void persistCreateOrder(Order order) {

        orderRepository.save(order);

    }
}

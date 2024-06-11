package org.example.restadapter.controller;

import domain.Order;
import org.example.restadapter.dto.OrderDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import port.input.CreateOrderPort;

@RestController
public class OrderController {

    private final CreateOrderPort createOrderPort;

    public OrderController(CreateOrderPort createOrderPort) {
        this.createOrderPort = createOrderPort;
    }

    @PostMapping("/create")
    public void createOrder(@RequestBody OrderDto newOrderDto) {

        Order order = new Order(newOrderDto.customerName());

        createOrderPort.create(order);

    }
}

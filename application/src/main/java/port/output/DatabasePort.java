package port.output;

import domain.Order;

public interface DatabasePort {

    void persistCreateOrder(Order order);
}

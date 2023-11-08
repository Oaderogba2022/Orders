package ie.atu.orderservice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class OrderDetails {

    private int orderId;
    private int productId;
    private int quantity;
    private int customerId;
    private int createOrder;
    private int getOrderbyId;

}

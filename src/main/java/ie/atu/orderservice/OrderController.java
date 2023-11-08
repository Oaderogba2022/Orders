package ie.atu.orderservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class OrderController {
    private OrdersServiceClient ordersServiceClient;

    @Autowired
    public OrderController(OrdersServiceClient ordersServiceClient){
        this.ordersServiceClient = ordersServiceClient;
    }
    @PostMapping("/confirm-orders")
    public Map<String, String > confirmOrders (@RequestBody OrderDetails orderDetails)
    {
        String orders = OrdersServiceClient.createOrder(OrderDetails);
        String orders2 = OrdersServiceClient.getOrderById(OrderDetails);
        Map < String, String > responseMessage = new HashMap<>();
        responseMessage.put("message", confirmOrders);
        return responseMessage;
    }

}

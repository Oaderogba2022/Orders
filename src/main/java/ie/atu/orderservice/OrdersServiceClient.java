package ie.atu.orderservice;


import org.springframework.cloud.openfeign.EnableFeignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestBody
@PostMapping
@EnableFeignClients

@FeignClient(name = "orders-service", url = "http://localhost:8080")
public interface OrdersServiceClient {

    @PostMapping("/incoming-orders")
    static String createOrder(@RequestBody OrderDetails orderDetails)

}

package id.my.hendisantika.sqsexample.controller;

import id.my.hendisantika.sqsexample.dto.OrderDto;
import id.my.hendisantika.sqsexample.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-sqs-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/3/24
 * Time: 08:14
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderDto> placeOrder(@RequestBody OrderDto orderDto) {
        return new ResponseEntity<>(this.orderService.placeOrder(orderDto), HttpStatus.OK);
    }
}

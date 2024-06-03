package id.my.hendisantika.sqsexample.service;

import id.my.hendisantika.sqsexample.dto.OrderDto;
import id.my.hendisantika.sqsexample.enums.MessageType;
import id.my.hendisantika.sqsexample.producer.SqsMessageProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-sqs-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/3/24
 * Time: 08:11
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {
    private final SqsMessageProducer producer;

    public void processOrder(OrderDto orderDto) {
        log.debug(" {} Process order from queue {} {}", orderDto);
        /*
        do the good order processing logic here
        not going to do that here, thats not the point of this demo app

         */
    }

    public OrderDto placeOrder(OrderDto orderDto) {
        log.debug(" {} Place order {} {}", orderDto);
        orderDto.setOrderId(UUID.randomUUID());
        orderDto.setOrderDate(new Date());

        Map<String, Object> headers = new HashMap<>();
        headers.put("Message-Type", MessageType.ORDER.name());
        headers.put("Content-Type", MediaType.APPLICATION_JSON_VALUE);
        log.debug("{} Send message to Queue {} ");
        this.producer.send(orderDto, headers);
        return orderDto;
    }
}

package id.my.hendisantika.sqsexample.service;

import id.my.hendisantika.sqsexample.dto.OrderDto;
import id.my.hendisantika.sqsexample.producer.SqsMessageProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
}

package id.my.hendisantika.sqsexample.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-sqs-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/3/24
 * Time: 08:06
 * To change this template use File | Settings | File Templates.
 */
@Data
public class OrderDto {
    private UUID orderId;
    private String reference;
    private Date orderDate;
    private String userId;
    private String coupon;
    private List<ProductDto> products;
}

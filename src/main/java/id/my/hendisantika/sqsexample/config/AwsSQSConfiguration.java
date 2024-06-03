package id.my.hendisantika.sqsexample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-sqs-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/3/24
 * Time: 08:03
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableSqs
public class AwsSQSConfiguration {

    @Value("${cloud.aws.region:ap-southeast-1}")
    private String awsRegion;


}

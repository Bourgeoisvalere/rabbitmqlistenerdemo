package com.rabbitlistenerproject.rabbitlistenerprojectdemo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQQueueConfiguration {
    @Bean
    Queue secondQueue(){
        return new Queue("Second Queue", false);
    }

    @Bean
    Queue thdQueue(){
        return QueueBuilder.durable("Third Queue").autoDelete().exclusive().build();
    }
}



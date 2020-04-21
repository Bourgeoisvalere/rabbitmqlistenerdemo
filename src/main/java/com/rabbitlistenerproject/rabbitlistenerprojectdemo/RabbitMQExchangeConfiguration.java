package com.rabbitlistenerproject.rabbitlistenerprojectdemo;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfiguration {
    @Bean
    Exchange exempleExchange(){
        return new TopicExchange("ExampleExchange");
    }

    @Bean
    Exchange exchange2nd(){
        return ExchangeBuilder.directExchange("ExampleExchange2nd").autoDelete().internal().build();
    }

    @Bean
    Exchange topicExchange(){
        return ExchangeBuilder.topicExchange("TopicExchange").autoDelete().durable(true).internal().build();
    }

    @Bean
    Exchange fanoutExchange(){
        return ExchangeBuilder.fanoutExchange("FanoutExchange").autoDelete().durable(false).internal().build();
    }

    @Bean
    Exchange hearderExchange(){
        return ExchangeBuilder.headersExchange("HeadersExchange").ignoreDeclarationExceptions().durable(true).internal().build();
    }

}

package com.example.demo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.example.demo.utils.Const.*;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = MARKETING_QUEUE)
    public void receivedMessageFromMarketingQueue(String messageData) {
        System.out.println("Received Message From RabbitMQ " + MARKETING_QUEUE + ": " + messageData);
    }

    @RabbitListener(queues = FINANCE_QUEUE)
    public void receivedMessageFromFinanceQueue(String messageData) {
        System.out.println("Received Message From RabbitMQ " + FINANCE_QUEUE + ": " + messageData);
    }

    @RabbitListener(queues = ADMIN_QUEUE)
    public void receivedMessageFromAdminQueue(String messageData) {
        System.out.println("Received Message From RabbitMQ " + ADMIN_QUEUE + ": " + messageData);
    }

    @RabbitListener(queues = ALL_QUEUE)
    public void receivedMessageFromAllQueue(String messageData) {
        System.out.println("Received Message From RabbitMQ " + ALL_QUEUE + ": " + messageData);
    }
}

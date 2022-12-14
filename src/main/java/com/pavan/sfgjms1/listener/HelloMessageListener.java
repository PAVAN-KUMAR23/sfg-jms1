package com.pavan.sfgjms1.listener;

import com.pavan.sfgjms1.config.JmsConfig;
import com.pavan.sfgjms1.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class HelloMessageListener {


    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void Listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers, Message message){

        System.out.println("I got a message!!!!!");
        System.out.println(helloWorldMessage);
    }
}

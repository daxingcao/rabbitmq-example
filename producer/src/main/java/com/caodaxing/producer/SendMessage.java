package com.caodaxing.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.caodaxing.entity.SimpleMessage;

@Component
public class SendMessage {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void sendMsg(SimpleMessage message)throws Exception {
		CorrelationData cd = new CorrelationData();
		cd.setId(message.getId());
		rabbitTemplate.convertAndSend("order-exchange",
				"msg.123",
				message,
				cd);
	}
	
}

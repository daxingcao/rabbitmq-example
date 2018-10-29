package com.caodaxing.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.caodaxing.entity.SimpleMessage;

@Component
public class ReceiverMessage {
	
	private final Logger log = LoggerFactory.getLogger(ReceiverMessage.class);

	@RabbitListener(bindings=@QueueBinding(
				value=@Queue(value="test1",durable="true"),
				exchange=@Exchange(name="order-exchange",durable="true",type="topic"),
				key="msg.#"
			)
	)
	@RabbitHandler
	public void receiverMsg(@Payload SimpleMessage msg)throws Exception {
		System.out.println("---------监听消息开始-----------");
		System.out.println("监听消息内容:"+msg.getMessage());
		log.info("这是一个日志...");
	}
	
}

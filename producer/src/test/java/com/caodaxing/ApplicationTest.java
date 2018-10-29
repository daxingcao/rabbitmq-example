package com.caodaxing;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.caodaxing.entity.SimpleMessage;
import com.caodaxing.producer.SendMessage;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTest {
	
	@Autowired
	private SendMessage sendMessage;

	@Test
	public void sendTest()throws Exception{
		SimpleMessage msg = new SimpleMessage();
		msg.setId("123");
		msg.setMessage("nice to meet you!");
		msg.setCreateDt(new Date());
		sendMessage.sendMsg(msg);
	}
	
}

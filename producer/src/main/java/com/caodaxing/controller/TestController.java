package com.caodaxing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caodaxing.entity.SimpleMessage;
import com.caodaxing.service.SimpleMessageService;

@RestController
public class TestController {
	
	@Autowired
	private SimpleMessageService simpleMessageService;
	
	@GetMapping("/test")
	public SimpleMessage getMessage(String id) {
		return simpleMessageService.queryMessageById(id);
	}

}

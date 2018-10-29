package com.caodaxing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caodaxing.entity.SimpleMessage;
import com.caodaxing.mapper.SimpleMessageMapper;
import com.caodaxing.service.SimpleMessageService;

@Service
public class SimpleMessageServiceImpl implements SimpleMessageService {

	@Autowired
	private SimpleMessageMapper simpleMessageMapper;
	
	@Override
	public SimpleMessage queryMessageById(String id) {
		return simpleMessageMapper.selectByPrimaryKey(id);
	}

}

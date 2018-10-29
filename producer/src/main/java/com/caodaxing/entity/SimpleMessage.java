package com.caodaxing.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleMessage implements Serializable {
	
	/**
	 * 主键ID
	 */
	private String id;
	/**
	 * 消息内容
	 */
	private String message;
	/**
	 * 发送者id，对应用户表主键id
	 */
	private String sender;
	/**
	 * 接受者id，对应用户表主键id
	 */
	private String receiver;
	/**
	 * 消息发送时间
	 */
	private Date createDt;
	/**
	 * 更新时间
	 */
	private Date updateDt;

}

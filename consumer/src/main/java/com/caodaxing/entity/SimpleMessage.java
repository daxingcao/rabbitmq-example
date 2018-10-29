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
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String message;
	private String sender;
	private String receiver;
	private Date createDt;
	private Date updateDt;

}

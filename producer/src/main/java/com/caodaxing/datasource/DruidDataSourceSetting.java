package com.caodaxing.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;


public class DruidDataSourceSetting {
	
	private String driverClassName;
	
	private String url;
	
	private String username;
	
	private String password;
	
	@Value("${druid.initialSize}")
	private int initialSize;
	
	@Value("${druid.maxActive}")
	private int maxActive;
	
	@Value("${druid.minIdle}")
	private int minIdle;
	
	@Value("${druid.maxWait}")
	private int maxWait;
	
	@Value("${druid.validationQuery}")
	private String validationQuery;
	
	@Value("${druid.testOnBorrow}")
	private Boolean testOnBorrow;
	
	@Value("${druid.testOnReturn}")
	private Boolean testOnReturn;
	
}

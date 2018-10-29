package com.caodaxing.datasource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;

public class MybatisDataSourceConfig {
	
	@Autowired
	private DataSource dataSource;
	
	@Bean("sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory() {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		//添加xml目录
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		try {
			bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
			SqlSessionFactory object = bean.getObject();
			object.getConfiguration().setCacheEnabled(Boolean.TRUE);
			return object;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer scan = new MapperScannerConfigurer();
		scan.setSqlSessionFactoryBeanName("sqlSessionFactory");
		scan.setBasePackage("com.caodaxing.mapper");
		return scan;
	}

}

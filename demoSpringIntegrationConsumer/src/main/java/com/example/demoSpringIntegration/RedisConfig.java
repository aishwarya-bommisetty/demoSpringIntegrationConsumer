package com.example.demoSpringIntegration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import redis.clients.jedis.JedisPoolConfig;

//configuration for the Jedis client

@Configuration
public class RedisConfig {

	@Value("${spring.redis.host}")
	private String redisHost;

	@Value("${spring.redis.port:6379}")
	private int redisPort;

	@Bean
	public JedisPoolConfig poolConfig() {
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxTotal(128);
		return poolConfig;
	}

	@Bean
	public RedisConnectionFactory redisConnectionFactory(JedisPoolConfig poolConfig) {
		/*
		 * final JedisConnectionFactory connectionFactory = new
		 * JedisConnectionFactory(); connectionFactory.afterPropertiesSet(); return
		 * connectionFactory;
		 */

		final JedisConnectionFactory connectionFactory = new JedisConnectionFactory();
		connectionFactory.setHostName(redisHost);
		connectionFactory.setPort(redisPort);
		connectionFactory.setPoolConfig(poolConfig);
		connectionFactory.setUsePool(true);
		return connectionFactory;
	}
}
package com.spring.profile.trail;

import com.spring.profile.trail.configuration.EnvConfig;
import com.spring.profile.trail.service.DBService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringprofileApplication implements CommandLineRunner{

	private static final Logger LOG = LoggerFactory.getLogger(SpringprofileApplication.class);

	@Autowired
	private EnvConfig envConfig;

	@Autowired
	private DBService dbService;

	@Override
	public void run(String... args)throws Exception{
		LOG.info("Environment configuration:{}", envConfig);
		LOG.info("DBService:{}", dbService.getDB());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringprofileApplication.class, args);
	}
}

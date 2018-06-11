package com.tw.mc.mem.ConfigService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.cloud.config.monitor.GitlabPropertyPathNotificationExtractor;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = { RabbitAutoConfiguration.class })
@EnableConfigServer
public class ConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);
	}
	
	@Bean
	public GitlabPropertyPathNotificationExtractor gitlabPropertyPathNotificationExtractor() {
	  return new GitlabPropertyPathNotificationExtractor();
	}
}

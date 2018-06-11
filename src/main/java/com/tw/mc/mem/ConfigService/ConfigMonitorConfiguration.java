package com.tw.mc.mem.ConfigService;

import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.cloud.config.monitor.GitlabPropertyPathNotificationExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Profile("config-monitor")
@Configuration
@Import(RabbitAutoConfiguration.class)
public class ConfigMonitorConfiguration {

	@Bean
	public GitlabPropertyPathNotificationExtractor gitlabPropertyPathNotificationExtractor() {
	  return new GitlabPropertyPathNotificationExtractor();
	}
}


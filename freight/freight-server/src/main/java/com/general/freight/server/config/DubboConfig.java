package com.general.freight.server.config;

import com.tqmall.dolphin.dubbo.CustomerDubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {

	@Value("${dubbo.consume.dolphin-version}")
	private  String dolphinDubboVersion;

//	@Bean
//	@ConditionalOnMissingBean
//	public CustomerDubboService customerDubboService() {
//		return DubboUtils.dubboConsumer(CustomerDubboService.class, dolphinDubboVersion);
//	}
}
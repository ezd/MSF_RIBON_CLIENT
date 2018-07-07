package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

public class MyRibonConfiguration {
	
	@Autowired
	IClientConfig iClientConfig;
	
	@Bean
	IPing ping(IClientConfig iClientConfig) {
		return new PingUrl();
	}
	
	@Bean
	IRule rule(IClientConfig clientConfig) {
		return new BestAvailableRule();
	}

	

}

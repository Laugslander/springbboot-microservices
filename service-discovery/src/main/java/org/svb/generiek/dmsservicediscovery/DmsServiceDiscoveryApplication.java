package org.svb.generiek.dmsservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DmsServiceDiscoveryApplication {
	public static void main(String[] args) {
		SpringApplication.run(DmsServiceDiscoveryApplication.class, args);
	}
}

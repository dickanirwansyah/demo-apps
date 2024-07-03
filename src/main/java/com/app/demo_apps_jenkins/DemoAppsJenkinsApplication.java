package com.app.demo_apps_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppsJenkinsApplication {

	public static void main(String[] args) {
		System.out.println("demo-apps-jenkins is starter");
		SpringApplication.run(DemoAppsJenkinsApplication.class, args);
	}

}

package com.aqms.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/sensorDataServiceFallBack")
	public String sensorDataServiceFallBack() {
		return "Sensor Data Service is DOWN...";
	}

	@GetMapping("/sensorPlotServiceFallBack")
	public String sensorPlotServiceFallBack() {
		return "Sensor Plot Service is DOWN...";
	}
}

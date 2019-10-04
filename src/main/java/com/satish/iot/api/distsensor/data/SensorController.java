package com.satish.iot.api.distsensor.data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorController {
	@RequestMapping("/")
	public String greeting(){
		return "Inventory detecting Service!!";
	}
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	@GetMapping(path="/sensor-data/device/{deviceID}")
	public SensorData sensorFetchData(@PathVariable String deviceID ) {
		LocalDateTime now = LocalDateTime.now();
		return new SensorData(deviceID, SensorValue.getDistance(),dtf.format(now));
	}
}

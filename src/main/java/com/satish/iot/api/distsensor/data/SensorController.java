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

import com.pi4j.io.gpio.RaspiPin;

@RestController
public class SensorController {
	@RequestMapping("/")
	public String greeting(){
		return "Inventory detecting Service!!";
	}
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	@GetMapping(path="/sensor-data/device/{deviceID}")
	public SensorData sensorFetchDataFrom1(@PathVariable String deviceID ) {
		LocalDateTime now = LocalDateTime.now();
		return new SensorData(deviceID, SensorValue.getDistance(RaspiPin.GPIO_00, RaspiPin.GPIO_02),dtf.format(now));
	}
	@GetMapping(path="/sensor-data/devicedummy/{deviceID}")
	public SensorData sensorFetchDataDummy(@PathVariable String deviceID ) {
		LocalDateTime now = LocalDateTime.now();
		return new SensorData(deviceID, "12.1",dtf.format(now));
	}
}

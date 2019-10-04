package com.satish.iot.api.distsensor.data;

public class SensorData {
	private String deviceID;
	private String levelValue;
	private String timeStamp;

	public SensorData(String deviceID, String levelValue, String timeStamp) {
		super();
		this.deviceID = deviceID;
		this.levelValue = levelValue;
		this.timeStamp = timeStamp;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public String getLevelValue() {
		return levelValue;
	}

	public void setLevelValue(String levelValue) {
		this.levelValue = levelValue;
	}

	public String getDate() {
		return timeStamp;
	}

	public void setDate(String date) {
		this.timeStamp = date;
	}

	@Override
	public String toString() {
		return "SensorData [deviceID=" + deviceID + ", levelValue=" + levelValue + ", timeStamp=" + timeStamp + "]";
	}


}

package com.srushti.bhim.dto;

import java.util.UUID;

public class DeviceInfo {
	private String name;
	private String brand;
	private String screenSize;
	private UUID deviceID;

	public UUID getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(UUID deviceID) {
		this.deviceID = deviceID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
}

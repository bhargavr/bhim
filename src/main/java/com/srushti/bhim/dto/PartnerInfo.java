package com.srushti.bhim.dto;

import java.util.List;
import java.util.UUID;

public class PartnerInfo {

	private String name;
	private String address;
	private List<DeviceInfo> devices;
	private UUID partnerId;
	private String businessType;

	public PartnerInfo() {

	}

	public UUID getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(UUID partnerId) {
		this.partnerId = partnerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<DeviceInfo> getDevices() {
		return devices;
	}

	public void setDevices(List<DeviceInfo> devices) {
		this.devices = devices;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

}

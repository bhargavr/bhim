package com.srushti.bhim.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.srushti.bhim.dto.DeviceInfo;
import com.srushti.bhim.dto.PartnerInfo;

/**
 * @author sumit
 *
 */
@RestController
public class RegisterController {

	@RequestMapping(value = "/register/partner", method = RequestMethod.POST)
	public ResponseEntity<PartnerInfo> registerPatner(PartnerInfo patnerInfo) {
		System.out.println("patnerInfo *****=" + patnerInfo.getName());
		if (patnerInfo != null) {
			patnerInfo.setName("testst");
			patnerInfo.setAddress("holly");
			patnerInfo.setPartnerId(new UUID(2, 4));
		}
		// TODO(sumit): add logic to persist & other logic
		return new ResponseEntity<PartnerInfo>(patnerInfo, HttpStatus.OK);
	}

	@RequestMapping(value = "/register/partner/{id}/device/{deviceId}", method = RequestMethod.POST)
	public ResponseEntity<PartnerInfo> registerPatnerDevice(
			PartnerInfo patnerInfo) {
		System.out.println("patnerInfo *****=" + patnerInfo.getName());
		if (patnerInfo != null) {
			patnerInfo.setName("testst");
			patnerInfo.setAddress("holly");
			patnerInfo.setPartnerId(new UUID(2, 4));
		}
		// TODO(sumit): add logic to persist & other logic
		return new ResponseEntity<PartnerInfo>(patnerInfo, HttpStatus.OK);
	}

	@RequestMapping(value = "/partner/{id}", method = RequestMethod.GET)
	public PartnerInfo getPatner(@PathVariable("id") String patnerId) {
		PartnerInfo info = new PartnerInfo();
		info.setAddress("Jhumry Teaih");
		info.setName("Hera lal");
		info.setBusinessType("Resturant");

		DeviceInfo device1 = new DeviceInfo();
		device1.setBrand("Samsung Tab");
		device1.setScreenSize("10 inch");
		device1.setDeviceID(new UUID(4, 2));
		device1.setName("Table no.1");

		DeviceInfo device2 = new DeviceInfo();
		device2.setBrand("Galaxy Tab");
		device2.setScreenSize("11 inch");
		device2.setDeviceID(new UUID(5, 2));
		device2.setName("Table no.3");

		List<DeviceInfo> devices = new ArrayList<DeviceInfo>();
		devices.add(device1);
		devices.add(device2);
		info.setDevices(devices);
		return info;
	}

	@RequestMapping(value = "/partner/{id}/devices", method = RequestMethod.GET)
	public List<DeviceInfo> getAllPatnerRegisteredDevices(
			@PathVariable("id") String patnerId) {

		DeviceInfo device1 = new DeviceInfo();
		device1.setBrand("Samsung Tab");
		device1.setScreenSize("10 inch");
		device1.setDeviceID(new UUID(4, 2));
		device1.setName("Table no.1");

		DeviceInfo device2 = new DeviceInfo();
		device2.setBrand("Galaxy Tab");
		device2.setScreenSize("11 inch");
		device2.setDeviceID(new UUID(5, 2));
		device2.setName("Table no.3");

		List<DeviceInfo> devices = new ArrayList<DeviceInfo>();
		devices.add(device1);
		devices.add(device2);

		return devices;
	}
}

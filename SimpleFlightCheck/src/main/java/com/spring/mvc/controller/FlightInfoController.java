package com.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.component.FlightInfo;
import com.spring.mvc.service.FlightInfoServImpl;

@RestController
public class FlightInfoController {

	@Autowired
	FlightInfoServImpl fiService;

	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value= "/getflightinfo", method= RequestMethod.GET) 
	public List<FlightInfo> getAllFlightInfo() {
		return fiService.getAllFlightInfo();
	}
	
	// Method to fetch filtered data
//	public List<FlightInfo> getFilteredInfo(@RequestParam(name = "flightNumber", required = false) String flightNumber,
//			@RequestParam(name = "origin", required = false) String origin,
//			@RequestParam(name = "destination", required = false) String destination,
//			@RequestParam(name = "inputDateStr", required = false) String inputDateStr)
}
package com.spring.mvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.mvc.component.FlightInfo;

@Repository
public class FlightInfoDaoImpl {
	
	
	public List<FlightInfo> getAllFlightInfoFromJSON() {
		List<FlightInfo> flightInfoList = new ArrayList<FlightInfo>();
		
		try{
			ObjectMapper mapper = new ObjectMapper();
			flightInfoList = mapper.readValue(ResourceUtils.getFile("classpath:flight-sample.json"), new TypeReference<List<FlightInfo>>(){});
		}catch(Exception e){
			e.printStackTrace();
		}

		return flightInfoList;
	}
}
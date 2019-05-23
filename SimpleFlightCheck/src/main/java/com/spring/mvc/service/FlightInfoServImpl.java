package com.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.component.FlightInfo;
import com.spring.mvc.repository.FlightInfoDaoImpl;


@Service
public class FlightInfoServImpl {

	@Autowired
	FlightInfoDaoImpl fidao;

	public List<FlightInfo> getAllFlightInfo() {
		return fidao.getAllFlightInfoFromJSON();
	}
}
package com.example.microservice.service;

import java.util.List;

import com.example.microservice.model.Hotel;

public interface HotelService {

	//create
	Hotel saveHotel(Hotel hotel);
	
	//get all hotel
	
	List<Hotel>getAllHotel();
	
	//get single hotel of given hotelid
	
	Hotel getHotel(String id);
}

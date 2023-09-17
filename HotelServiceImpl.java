package com.example.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservice.exception.ResourceNotFoundException;
import com.example.microservice.model.Hotel;
import com.example.microservice.repository.HotelRepo;
@Service
public class HotelServiceImpl implements HotelService{
	@Autowired
	private HotelRepo hotelRepo;
	@Override
	public Hotel saveHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getHotel(String id) {
		// TODO Auto-generated method stub
		return hotelRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel of given id not found"));
	}

}

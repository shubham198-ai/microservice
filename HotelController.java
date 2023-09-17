package com.example.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.model.Hotel;
import com.example.microservice.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
@Autowired
	private HotelService hotelService;
	
	//create
@PostMapping("/add")
public ResponseEntity<Hotel>createHotel(@RequestBody Hotel hotel){
	
	Hotel hotel1=hotelService.saveHotel(hotel);
	return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
	
}
//get all hotels
@GetMapping("/getall")
public ResponseEntity<List<Hotel>>getAllHotel(){
	List<Hotel>allHotel=hotelService.getAllHotel();
	return ResponseEntity.ok(allHotel);
}
@GetMapping("/{id}")
public ResponseEntity<Hotel>getSingleHotel(@PathVariable String id){
	
	Hotel hotel=hotelService.getHotel(id);
	return ResponseEntity.ok(hotel);
	
}
}



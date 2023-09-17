package com.example.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.microservice.model.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, String> {

}

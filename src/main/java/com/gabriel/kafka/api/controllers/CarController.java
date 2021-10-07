package com.gabriel.kafka.api.controllers;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.gabriel.kafka.api.messages.producer.CarProducer;

import com.gabriel.kafka.api.model.DTO.CarDTO;
import com.gabriel.kafka.api.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
     private CarProducer carProducer;
	
	@Autowired
	private CarService carService;

	@PostMapping
	public ResponseEntity<CarDTO> criate(@RequestBody CarDTO carDTO)
	{	
		carProducer.send(carDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(carDTO);

	}
	

}

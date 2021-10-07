package com.gabriel.kafka.api.model.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter @Getter
@NoArgsConstructor

public class CarDTO {
	private String id;
	private String model;
	private String color;

}

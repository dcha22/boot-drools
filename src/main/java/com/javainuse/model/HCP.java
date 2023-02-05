package com.javainuse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HCP {

	private String name;
	private String country;
	private String address;
	private String routeTo;
	
}

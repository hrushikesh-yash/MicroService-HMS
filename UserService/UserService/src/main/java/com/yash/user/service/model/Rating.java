package com.yash.user.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	
	private Long ratingId;
	
	private Long userId;
	
	private Long hotelId;
	
	private int ratingNUmber;
	
	private String feedback;
	
}

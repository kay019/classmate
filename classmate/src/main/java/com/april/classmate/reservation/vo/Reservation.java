package com.april.classmate.reservation.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data 
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
	
	private String reservation_code;
	private String reservation_class;
	private String reservation_member; 
	private String reservation_time;
	private String reservation_count;  
	private String reservation_status; 
	private String reservation_history;  
}

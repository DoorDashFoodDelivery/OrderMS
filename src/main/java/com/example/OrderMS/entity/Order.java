package com.example.OrderMS.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.OrderMS.dto.FoodItemDTO;
import com.example.OrderMS.dto.RestaurantDTO;
import com.example.OrderMS.dto.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("order")
public class Order {
	
	private Integer orderId;
	private List<FoodItemDTO> foodItemList;
	private RestaurantDTO restaurantDTO;
	private UserDTO userDTO;
	
}

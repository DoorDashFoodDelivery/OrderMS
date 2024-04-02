package com.example.OrderMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.OrderMS.Mapper.OrderMapper;
import com.example.OrderMS.dto.OrderDTO;
import com.example.OrderMS.dto.OrderDTOFromFE;
import com.example.OrderMS.dto.UserDTO;
import com.example.OrderMS.entity.Order;
import com.example.OrderMS.repo.OrderRepo;

@Service
public class OrderService {
	
	@Autowired
	OrderRepo orderRepo;
	
	@Autowired	
	SequenceGenerator sequenceGenerator;
	
	@Autowired
	RestTemplate restTemplate;

	public OrderDTO saveOrderInDB(OrderDTOFromFE orderDetails) {
	Integer newOrderId=sequenceGenerator.generateNextOrderId();
	
	UserDTO userDTO=fetchUserDetailsFromUserId(orderDetails.getUserId());
	
		Order orderToBeSaved=new  Order(newOrderId, orderDetails.getFoodItemList(), orderDetails.getRestaurant(), userDTO);
		orderRepo.save(orderToBeSaved);
		return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToBeSaved);
	}

	private UserDTO fetchUserDetailsFromUserId(Integer userId) {
		return	restTemplate.getForObject("http://UserInformation/user/fetchUserById/"+userId, UserDTO.class);
	}
}

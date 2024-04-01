package com.example.OrderMS.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.OrderMS.dto.OrderDTO;
import com.example.OrderMS.entity.Order;

@Mapper
public interface OrderMapper {

	OrderMapper INSTANCE=Mappers.getMapper(OrderMapper.class);
	
	Order mapOrderDTOToOrder(OrderDTO orderDTO);
	
	OrderDTO mapOrderToOrderDTO(Order order);
}

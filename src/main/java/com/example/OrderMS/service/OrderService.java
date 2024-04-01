package com.example.OrderMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OrderMS.repo.OrderRepo;

@Service
public class OrderService {
	
	@Autowired
	OrderRepo orderRepo;
}

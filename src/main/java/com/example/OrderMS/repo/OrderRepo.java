package com.example.OrderMS.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.OrderMS.entity.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order,Integer>{

}

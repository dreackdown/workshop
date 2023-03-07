package com.educandoweb.course.services;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll() {
        LOGGER.info("Retorno de Orders com sucesso");
        return OrderRepository.findAll();
    }

    public Order fyndById(Long id) {
        Optional<Order> obj = OrderRepository.findById(id);
        LOGGER.info("Retorno do Order: " + obj.get().getClient() + obj.get().getMoment());
        return obj.get();
    }
}

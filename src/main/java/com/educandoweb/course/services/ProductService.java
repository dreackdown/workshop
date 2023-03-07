package com.educandoweb.course.services;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.ProductRepository;
import com.educandoweb.course.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        LOGGER.info("Retorno de Products com sucesso");
        return productRepository.findAll();
    }

    public Product fyndById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        LOGGER.info("Retorno de Product: " + obj.get().getName());
        return obj.get();
    }
}

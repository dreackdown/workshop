package com.educandoweb.course.services;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryService.class);

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        LOGGER.info("Retorno de Categories com sucesso");
        return categoryRepository.findAll();
    }

    public Category fyndById(Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        LOGGER.info("Retorno de Category: " + obj.get().getName());
        return obj.get();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boat.service;

import com.boat.model.Category;
import com.boat.repository.CategoryRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jquiroga
 */

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepository;
    
    public List<Category> getAll(){
        return (List<Category>) categoryRepository.getAll();
    }
    public Optional <Category> getCategory(int id){
        return categoryRepository.getCategory(id);
    }
    public Category save(Category category){
        if(category.getId()==null){
            return categoryRepository.save(category);
        }
        else{
            Optional<Category> evt=categoryRepository.getCategory(category.getId());
            if(evt.isEmpty()){
                return categoryRepository.save(category);
            }
            else{
                return category;
            }
        }
        }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boat.repository;

import com.boat.model.Boat;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jquiroga
 */
public interface BoatRepository extends CrudRepository<Boat, Integer> {
  
}

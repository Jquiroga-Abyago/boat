/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boat.repository;


import com.boat.model.Client;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jquiroga
 */
public interface ClientRepository extends CrudRepository<Client, Integer> {

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boat.service;

import com.boat.model.Client;
import com.boat.repository.ClientRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jquiroga
 */

@Service
public class ClientService {
    @Autowired
    private ClientRepo clientRepository;
    
    public List<Client> getAll(){
        return (List<Client>) clientRepository.getAll();
    }
    public Optional <Client> getClient(int idClient){
        return clientRepository.getClient(idClient);
    }
    public Client save(Client clients){
        if(clients.getIdClient()==null){
            return clientRepository.save(clients);
        }
        else{
            Optional<Client> evt=clientRepository.getClient(clients.getIdClient());
            if(evt.isEmpty()){
                return clientRepository.save(clients);
            }
            else{
                return clients;
            }
        }
        }
    
}

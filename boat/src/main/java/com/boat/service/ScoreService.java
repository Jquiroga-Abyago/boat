/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boat.service;

import com.boat.model.Score;
import com.boat.repository.ScoreRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jquiroga
 */

@Service
public class ScoreService {
    @Autowired
    private ScoreRepo scoreRepository;
    
    public List<Score> getAll(){
        return (List<Score>) scoreRepository.getAll();
    }
    public Optional <Score> getScore(int idScore){
        return scoreRepository.getScore(idScore);
    }
    public Score save(Score scores){
        if(scores.getIdScore()==null){
            return scoreRepository.save(scores);
        }
        else{
            Optional<Score> evt=scoreRepository.getScore(scores.getIdScore());
            if(evt.isEmpty()){
                return scoreRepository.save(scores);
            }
            else{
                return scores;
            }
        }
        }
    
}

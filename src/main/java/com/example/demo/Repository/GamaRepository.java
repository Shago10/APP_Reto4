/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repository;

import com.example.demo.Model.Gama;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.Repository.CRUD.GamaCrudRepository;

/**
 *
 * @author santi
 */
@Repository
public class GamaRepository {
    @Autowired
    private GamaCrudRepository gammaCrudRepository;
    
    public List<Gama> findAll(){
        return (List<Gama>) gammaCrudRepository.findAll();
    }
    
    public Optional<Gama> getGamma(int id){
        return gammaCrudRepository.findById(id);
    }
   
    public Gama save(Gama gamma){
        return gammaCrudRepository.save(gamma);
    }
    
    public void delete(Gama gamma){
        gammaCrudRepository.delete(gamma);
    }
}

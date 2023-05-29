/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Repository.CRUD;

import com.example.demo.Model.Score;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author santi
 */
public interface ScoreCrudRepository extends CrudRepository<Score, Integer> {
    
}

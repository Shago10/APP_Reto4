/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Repository.CRUD;

import com.example.demo.Model.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author santi
 */
public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
    
}

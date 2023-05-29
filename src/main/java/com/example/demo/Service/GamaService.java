/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Service;

import com.example.demo.Model.Gama;
import com.example.demo.Repository.GamaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.Boolean;
/**
 *
 * @author santi
 */
@Service
public class GamaService {
    @Autowired
    private GamaRepository gammaRepository;
    
    public List<Gama> getAll(){
        return gammaRepository.findAll();
    }
    
    public Optional<Gama> getGamma(int id){
        return gammaRepository.getGamma(id);
    }
    
    public Gama save(Gama gamma){
        if(gamma.getIdGama()==null){
            return gammaRepository.save(gamma);
        }
        
        else{
            Optional<Gama> gammaEncontrado = getGamma(gamma.getIdGama());
            if(gammaEncontrado.isEmpty()){
                return gammaRepository.save(gamma);
            }else{
                return gamma;
            } 
        }
    }
    public Gama update(Gama gamma){
        if(gamma.getIdGama()!=null){
            Optional<Gama> gammaEncontrado = getGamma(gamma.getIdGama());
            if(gammaEncontrado.isPresent()){
                if(gamma.getName()!=null){
                    gammaEncontrado.get().setName(gamma.getName());       
                }
                if(gamma.getDescription()!=null){
                    gammaEncontrado.get().setDescription(gamma.getDescription());
                }
                return gammaRepository.save(gammaEncontrado.get());
            }else{
                return gamma;
            }
        }else{
            return gamma;
        }
        
    }
    
    public boolean deleteGamma(int id){
        Boolean respuesta = getGamma(id).map(gamma -> {
            gammaRepository.delete(gamma);
            return true;
        }).orElse(false);
        
        return respuesta;
    }
}

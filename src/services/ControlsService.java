/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ControlsDao;
import entity.Controls;
import java.util.List;


/**
 *
 * @author tassy
 */
public class ControlsService {
    
    private final ControlsDao controlsDao;
    
    public ControlsService(){    
        controlsDao = new ControlsDao();        
    }
    
    //findbyId
    public Controls findById(int id){
        return controlsDao.findById(id);
    }
    
    //findbyName
    public Controls findByName(String name){
        return controlsDao.findByName(name);
    }
    
    //findAll
     public List<Controls> findAll() {
         return controlsDao.findAll();
     
     }
    
}

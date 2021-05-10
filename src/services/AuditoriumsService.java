/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.AuditoriumsDao;
import entity.Auditoriums;
import java.util.List;


/**
 *
 * @author tassy
 */
public class AuditoriumsService {
    
    private final AuditoriumsDao audDao;
    
    public AuditoriumsService() {
        audDao = new AuditoriumsDao();
    }
    
    //findbyId
    public Auditoriums findById(int id){
        return audDao.findById(id);
    }
    
    //findAll
    
     public List<Auditoriums> findAll() {
         
        return audDao.findAll();
     
     }
    
}

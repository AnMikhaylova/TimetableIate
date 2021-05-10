/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.PeriodsDao;
import entity.Periods;
import java.util.List;


/**
 *
 * @author tassy
 */
public class PeriodsService {
    
    private final PeriodsDao periodsDao;
    
    public PeriodsService(){
    
        periodsDao = new PeriodsDao();
    }
    
    //findbyId
    public Periods findById(int id){
        return periodsDao.findById(id);
    }
    
    //findAll
     public List<Periods> findAll() {
         return periodsDao.findAll();
     
     }
    
}

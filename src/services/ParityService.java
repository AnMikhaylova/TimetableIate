/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ParityDao;
import entity.Parity;
import java.util.List;


/**
 *
 * @author tassy
 */
public class ParityService {
    
    private final ParityDao parityDao;
    
    public ParityService(){
    
        parityDao = new ParityDao();
    }
    
    //findbyId
    public Parity findById(int id){
        return parityDao.findById(id);
    }
    
    //findAll
     public List<Parity> findAll() {
         return parityDao.findAll();     
     }
    
}

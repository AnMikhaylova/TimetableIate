/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import dao.TeamsDao;
import entity.Teams;
import java.util.List;

/**
 *
 * @author tassy
 */
public class TeamsService {
    
    private final TeamsDao teamsDao;
    
    public TeamsService(){
        teamsDao =  new TeamsDao();        
    }
    
    //findbyId
    public Teams findById(int id){
        return teamsDao.findById(id);
    }
    
    //findbyName
    public Teams findByName(String name){
        return teamsDao.findByName(name);
    }
    
    //findAll
     public List<Teams> findAll() {
         return teamsDao.findAll();
     
     }
    
}

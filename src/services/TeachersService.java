/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.TeachersDao;
import entity.Teachers;
import java.util.List;

/**
 *
 * @author tassy
 */
public class TeachersService {
    
    private final TeachersDao teachersDao;
    
    public TeachersService(){
    
        teachersDao = new TeachersDao();
    }
    //findbyId
    public Teachers findById(int id){
        return teachersDao.findById(id);
    }
    
    //findbyName
    public Teachers findByName(String name){
        return teachersDao.findByName(name);
    }
    
    //save
    public void save(Teachers teacher) {
        teachersDao.save(teacher);
    }
    
    //update
    public void update(Teachers teacher) {
        teachersDao.update(teacher);
    }
    
    //delete?
     public void delete(Teachers teacher) {
        teachersDao.delete(teacher);
     }
     
    //findAll
     public List<Teachers> findAll() {
         return teachersDao.findAll();
     
     }
    
}

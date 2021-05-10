/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.UsersDao;
import entity.Users;
import java.util.List;

/**
 *
 * @author tassy
 */
public class UsersService {
    
    private final UsersDao usersDao;
    
    public UsersService(){
    
        usersDao = new UsersDao();
    }
    
    //findbyId
    public Users findById(int id){
        return usersDao.findById(id);
    }
    
    //save
    public void save(Users user) {
        usersDao.save(user);
    }
    
    //update
    public void update(Users user) {
        usersDao.update(user);
    }
    
    //delete?
     public void delete(Users user) {
        usersDao.delete(user);
     }
     
    //findAll
     public List<Users> findAll() {
         return usersDao.findAll();
     
     }
    
}

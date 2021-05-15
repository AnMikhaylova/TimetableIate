/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.TasksDao;
import entity.Tasks;
import java.util.List;

/**
 *
 * @author tassy
 */
public class TasksService {
    
    private final TasksDao tasksDao;
    
    public TasksService(){
    
        tasksDao = new TasksDao();
    }
    
    //findbyId
    public Tasks findById(int id){
        return tasksDao.findById(id);
    }
    
    //save
    public void save(Tasks task) {
        tasksDao.save(task);
    }
    
    //update
    public void update(Tasks task) {
        tasksDao.update(task);
    }
    
    //delete?
     public void delete(Tasks task) {
        tasksDao.delete(task);
     }
     
    //findAll
     public List<Tasks> findAll() {
         return tasksDao.findAll();
     
     }
    
}

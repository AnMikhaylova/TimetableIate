/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.Tasks;
import java.util.List;

/**
 *
 * @author tassy
 */
public class TasksService {
    
    private final TasksService tasksService;
    
    public TasksService(){
    
        tasksService = new TasksService();
    }
    
    //findbyId
    public Tasks findById(int id){
        return tasksService.findById(id);
    }
    
    //save
    public void save(Tasks task) {
        tasksService.save(task);
    }
    
    //update
    public void update(Tasks task) {
        tasksService.update(task);
    }
    
    //delete?
     public void delete(Tasks task) {
        tasksService.delete(task);
     }
     
    //findAll
     public List<Tasks> findAll() {
         return tasksService.findAll();
     
     }
    
}

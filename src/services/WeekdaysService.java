/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.Weekdays;
import java.util.List;

/**
 *
 * @author tassy
 */
public class WeekdaysService {
    
    private final WeekdaysService weekdaysService;
    
    public WeekdaysService(){
    
        weekdaysService = new WeekdaysService();
    }
    
    //findbyId
    public Weekdays findById(int id){
        return weekdaysService.findById(id);
    }
    
    //findAll
     public List<Weekdays> findAll() {
         return weekdaysService.findAll();
     
     }
    
}

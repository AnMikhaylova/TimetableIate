/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import dao.TimetableIateDao;
import entity.TimetableIate;
import java.util.List;

/**
 *
 * @author tassy
 */
public class TimetableIateService {
    
    private final TimetableIateDao timetableIateDao;
    
    public TimetableIateService(){
    
        timetableIateDao =  new TimetableIateDao();
    }
    
    //findbyId
    public TimetableIate findById(int id){
        return timetableIateDao.findById(id);
    }
    
    //save
    public void save(TimetableIate timetable) {
        timetableIateDao.save(timetable);
    }
    
    //update
    public void update(TimetableIate timetable) {
        timetableIateDao.update(timetable);
    }
    
    //delete?
     public void delete(TimetableIate timetable) {
        timetableIateDao.delete(timetable);
     }
     
    //findAll
     public List<TimetableIate> findAll() {
         return timetableIateDao.findAll();
     
     }
    
}

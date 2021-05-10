/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.SubjectsDao;
import entity.Subjects;
import java.util.List;
/**
 *
 * @author tassy
 */
public class SubjectsService {
    
    private final SubjectsDao subjectsDao;
    
    public SubjectsService(){
    
        subjectsDao = new SubjectsDao();
    }
    
    //findbyId
    public Subjects findById(int id){
        return subjectsDao.findById(id);
    }
    
    //save
    public void save(Subjects subj) {
        subjectsDao.save(subj);
    }
    
    //update
    public void update(Subjects subj) {
        subjectsDao.update(subj);
    }
    
    //delete?
     public void delete(Subjects subj) {
         subjectsDao.delete(subj);
     }
     
    //findAll
     public List<Subjects> findAll() {
        return subjectsDao.findAll();
     
     }
    
}

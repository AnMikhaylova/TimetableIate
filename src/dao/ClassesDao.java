/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Classes;
import java.util.List;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class ClassesDao {
    
    //findbyId
    public Classes findById(int id){
        return (Classes)NewHibernateUtil.getSessionFactory().openSession().get(Classes.class, id);
    }
    
    //findAll
     public List<Classes> findAll() {
         List<Classes> cl = (List<Classes>)NewHibernateUtil.getSessionFactory().openSession().createQuery("From Classes").list();
        return cl;     
     }
    
}

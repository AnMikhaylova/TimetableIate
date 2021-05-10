/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Controls;
import java.util.List;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class ControlsDao {
    
    //findbyId
    public Controls findById(int id){
        return (Controls)NewHibernateUtil.getSessionFactory().openSession().get(Controls.class, id);
    }
    
    //findAll
     public List<Controls> findAll() {
         List<Controls> c = (List<Controls>)NewHibernateUtil.getSessionFactory().openSession().createQuery("From Controls").list();
        return c;
     
     }
}

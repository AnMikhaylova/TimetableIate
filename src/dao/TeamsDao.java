/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Teams;
import java.util.List;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class TeamsDao {
    //findbyId
    public Teams findById(int id){
        return (Teams)NewHibernateUtil.getSessionFactory().openSession().get(Teams.class, id);
    }
    
    //findbyName
    public Teams findByName(String name){ 
        String query = "FROM Teams T WHERE T.team =" + "'" + name + "'";
        return (Teams)NewHibernateUtil.getSessionFactory().openSession().createQuery(query).uniqueResult();
        
       
    }
    
    //findAll
     public List<Teams> findAll() {
         List<Teams> t = (List<Teams>)NewHibernateUtil.getSessionFactory().openSession().createQuery("From Teams").list();
        return t;
     
     }
    
}

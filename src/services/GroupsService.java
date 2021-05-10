/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.GroupsDao;
import entity.Groups;
import java.util.List;


/**
 *
 * @author tassy
 */
public class GroupsService {
    
    private final GroupsDao groupsDao;
    
    public GroupsService (){
    
        groupsDao = new GroupsDao();
    }
    
    //findbyId
    public Groups findById(int id) {
        return groupsDao.findById(id);
    }

    //save
    public void save(Groups groups) {
        groupsDao.save(groups);
    }

    //update
    public void update(Groups groups) {
        groupsDao.update(groups);
    }

    //delete?
    public void delete(Groups groups) {
        groupsDao.delete(groups);
    }

    //findAll
    public List<Groups> findAll() {
        return groupsDao.findAll();

    }
}

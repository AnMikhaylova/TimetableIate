/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ClassesDao;
import entity.Classes;
import java.util.List;


/**
 *
 * @author tassy
 */
public class ClassesService {

    private final ClassesDao classesDao;

    public ClassesService() {
        classesDao = new ClassesDao();
    }

    //findbyId
    public Classes findById(int id) {
        return classesDao.findById(id);
    }

    //findAll
    public List<Classes> findAll() {
        return classesDao.findAll();
    }

}

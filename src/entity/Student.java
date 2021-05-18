/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author tassy
 */
public class Student {
    
    private Groups group;
    private Teams team;
    
    public Student(){
        
    }
    
    public Student (Groups g, Teams t){
        this.group = g;
        this.team = t;
    }

    public Groups getGroup() {
        return group;
    }

    public Teams getTeam() {
        return team;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    public void setTeam(Teams team) {
        this.team = team;
    }
    
    
    
}

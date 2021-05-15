/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableTimetable;

import javax.swing.table.DefaultTableModel;
import entity.TimetableIate;
import java.util.ArrayList;

/**
 *
 * @author 79105
 */
public class ModelTimetable extends DefaultTableModel{

    private ArrayList<TimetableIate> data = new ArrayList<>();
    private String[] colNames = {"Periods", "Subject", "Class", "Team", "Audience", "Teachers"};
    private Class[] colClasses = {Integer.class, String.class, String.class, String.class, String.class, String.class};

    public void appendElem(TimetableIate time){
        data.add(time);
        fireTableDataChanged();
    }

    @Override
    public Object getValueAt(int row, int column) {
        if(data == null || data.isEmpty())return null;
        TimetableIate time = data.get(row);
        switch(column){
            case 0: return time.getPeriods().getPeriodNum();
            case 1: return time.getSubjects().getSubject();
            case 2: return time.getClasses().getClass_name();
            case 3: return time.getTeams().getTeam();
            case 4: return time.getAuditoriums().getAuditorium();
            default: return time.getTeachers().getTeacherFio();
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public int getRowCount() {
        if(data == null || data.isEmpty())return 0;
        return data.size();
    }


}

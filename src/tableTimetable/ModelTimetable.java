/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableTimetable;

import javax.swing.table.DefaultTableModel;
import entity.TimetableIate;
import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author 79105
 */
public class ModelTimetable extends DefaultTableModel{

    private ArrayList<TimetableIate> data = new ArrayList<>();
    private String[] colNames = {"Начало пары", "Конец пары", "Чётность","Предмет", "Вид занятия", "Состав группы", "Преподаватель", "Аудитория", };
    private Class[] colClasses = {Date.class, Date.class, String.class, String.class, String.class, String.class, String.class};

    public void appendElem(TimetableIate time){
        data.add(time);
        fireTableDataChanged();
    }

    @Override
    public Object getValueAt(int row, int column) {
        if(data == null || data.isEmpty())return null;
        TimetableIate time = data.get(row);
        switch(column){
            case 0: return time.getPeriods().getBegining();
            case 1: return time.getPeriods().getEnding();
            case 2: return time.getParity().getWeek();
            case 3: return time.getSubjects().getSubject();
            case 4: return time.getClasses().getClass_name();
            case 5: return time.getTeams().getTeam();
            case 6: return time.getTeachers().getTeacherFio();
            default: return time.getAuditoriums().getAuditorium();
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
        return 8;
    }

    @Override
    public int getRowCount() {
        if(data == null || data.isEmpty())return 0;
        return data.size();
    }


}

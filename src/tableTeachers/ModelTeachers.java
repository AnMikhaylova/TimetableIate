/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableTeachers;

import entity.Teachers;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 79105
 */
public class ModelTeachers extends DefaultTableModel{
    
    private ArrayList<Teachers> data = new ArrayList<>();
    private String[] colNames = {"ФИО", "Эл. почта"};
    private Class[] colClasses = {String.class, String.class};
    
    public void appendElem(Teachers teac){
        data.add(teac);
        fireTableDataChanged();
    }

    @Override
    public Object getValueAt(int row, int column) {
        if(data == null || data.isEmpty())return null;
        Teachers teac = data.get(row);
        switch(column){
            case 0: return teac.getTeacherFio();
            default: return teac.getEmail();
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
        return 2;
    }

    @Override
    public int getRowCount() {
        if(data == null || data.isEmpty())return 0;
        return data.size();
    }
}

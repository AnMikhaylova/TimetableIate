/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableTasks;

import entity.Tasks;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 79105
 */
public class ModelTasks extends DefaultTableModel{
    
    private ArrayList<Tasks> data = new ArrayList<>();
    private String[] colNames = {"Срок сдачи", "Предмет", "Вид контроля", "Описание"};
    private Class[] colClasses = {Date.class, String.class, String.class, String.class};
    
    public void appendElem(Tasks t){
        data.add(t);
        fireTableDataChanged();
    }

    @Override
    public Object getValueAt(int row, int column) {
        if(data == null || data.isEmpty())return null;
        Tasks t = data.get(row);
        switch(column){
            case 0: return t.getDeadline();
            case 1: return t.getSubjects().getSubject();
            case 2: return t.getControls().getControl();
            default: return t.getDescription();
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
        return 4;
    }

    @Override
    public int getRowCount() {
        if(data == null || data.isEmpty())return 0;
        return data.size();
    
    }
    
}

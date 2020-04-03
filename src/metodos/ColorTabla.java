/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author VictorManuel
 */
public class ColorTabla extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col){
        
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        
        if(table.getValueAt(row, 4).toString().equals("00:00:00") ){
            setBackground(Color.getHSBColor(232, 249, 41));
            setForeground(Color.BLACK);
            
        }
        else if(table.getValueAt(row, 2).toString()!=("00:00:00")){
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
            
        }
        
        return this;
        
    }
    
}

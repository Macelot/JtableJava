/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author marcelo
 */
public class CustomTableRenderer extends DefaultTableCellRenderer{
     // You should override getTableCellRendererComponent
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {

        Component c = super.getTableCellRendererComponent(table, value, isSelected,
                hasFocus, row, column);

        // Check the column name, if it is "version"
        if (table.getColumnName(column).compareToIgnoreCase("version") == 0) {
            // You know version column includes string
            String versionVal = (String) value;

            if (versionVal.contains("FAKE")) {
                //set to red bold font
                c.setForeground(Color.RED);
                c.setFont(new Font("Dialog", Font.BOLD, 30));
            } else {
                //stay at default
                c.setForeground(Color.BLACK);
                c.setFont(new Font("Dialog", Font.PLAIN, 30));
            }
        } else {
            // Here you should also stay at default
            //stay at default
            c.setForeground(Color.BLACK);
            c.setFont(new Font("Dialog", Font.PLAIN, 30));
        }
        c.setFont(new Font("Dialog", Font.PLAIN, 50));
        return c;
    }
}

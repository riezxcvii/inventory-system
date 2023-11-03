
package Server;

import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SearchInTable {
    DefaultTableModel model;
    public void search(String searchText,   JTable table){
        model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter(model);
        table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
    }
}

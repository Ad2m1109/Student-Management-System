package model;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class tableModele extends AbstractTableModel{
    //list
    private List<etudiant> etudiants;
    private String[] columnNames = {"id", "nom", "prenom", "sexe", "filiere"};
    public tableModele() {
        etudiants = new ArrayList<>();
    }
    @Override
    public int getRowCount() {
        return etudiants.size();
    }
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return etudiants.get(rowIndex).getId();
            case 1:
                return etudiants.get(rowIndex).getNom();
            case 2:
                return etudiants.get(rowIndex).getPrenom();
            case 3:
                return etudiants.get(rowIndex).getSexe();
            case 4:
                return etudiants.get(rowIndex).getFiliere();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    public void setEtudiants(List<etudiant> etudiants) {
        this.etudiants = etudiants;
        fireTableDataChanged();
    }
}

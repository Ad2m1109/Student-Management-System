package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.etudiant;

public class useDAO {
    public void adduser(etudiant e)
    {
        Connection cn=singleconnection.getInstance();
        try
        {
            PreparedStatement st=cn.prepareStatement("insert into user(nom,prenom,item,genre)values(?,?,?,?)");
            st.setString(1,e.getNom());
            st.setString(2,e.getPrenom() );
            st.setString(3, e.getFiliere());
            st.setString(4,e.getSexe() );
            st.executeUpdate();
        }
        catch(SQLException e1)
        {
            e1.printStackTrace();
        }
    }
    
    public void deleteUser(int id) {
        Connection cn = singleconnection.getInstance();
        try {
            PreparedStatement st = cn.prepareStatement("DELETE FROM user WHERE id=?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public List<etudiant> getAllUsers() {
        List<etudiant> etudiants = new ArrayList<>();
        Connection cn = singleconnection.getInstance();
        try {
            PreparedStatement st = cn.prepareStatement("SELECT * FROM user");
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                etudiant e = new etudiant(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("item"),
                    rs.getString("genre")
                );
                etudiants.add(e);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return etudiants;
    }

    public int getLastId() {
        int lastId = 0;
        Connection cn = singleconnection.getInstance();
        try {
            PreparedStatement st = cn.prepareStatement("SELECT MAX(id) as maxId FROM user");
            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                lastId = rs.getInt("maxId");
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return lastId;
    }
}

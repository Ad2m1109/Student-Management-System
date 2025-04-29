package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class singleconnection {
    private static Connection cn;
    private singleconnection () {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost/lasttp","root","root");
    }
    catch(ClassNotFoundException e)
    {
        e.printStackTrace();
    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
}
public static Connection getInstance(){
    if(cn==null)
    {
        new singleconnection();
    }
    return cn;
}
}
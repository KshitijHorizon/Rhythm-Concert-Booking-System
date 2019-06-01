package pop2;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chiranjeebi Khanal
 */

//This is a Server Architecture 


public class DatabaseConnect {
    public static Connection ConnectDb()
    {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1= DriverManager.getConnection("jdbc.mysql://localhost:3306/rhythm","root","");
            
            //Developers has made this class such that anyone from anywhere having this software with databse can replace their username ausername and password for database connection
            return con1;
        }
        catch(Exception e){
    
        JOptionPane.showMessageDialog(null,e);
    }
        return null;
        
    }
}

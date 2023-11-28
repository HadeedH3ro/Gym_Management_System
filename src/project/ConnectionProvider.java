/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import java.lang.Exception;
/**
 *
 * @author HP
 */
public class ConnectionProvider {
      public static Connection getCon() throws ClassNotFoundException, SQLException
      {
      try{ 
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection Con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/gym","root", "hadeed");
      return Con;    
      }
      catch (Exception e){
      return null;
      }
      }
      
}

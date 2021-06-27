package Konektor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Azka
 */
public class Koneksi {
    private Connection Inv_Connect;
    
    public Connection connect(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Berhasil Koneksi");
         }  catch (ClassNotFoundException ex){
             System.out.println("Gagal Koneksi"+ ex);
         }  
      
      String url = "jdbc:mysql://localhost:3306/krsproject";
      try{
          Inv_Connect = DriverManager.getConnection(url,"root","");
          System.out.println("Berhasil Koneksi Database");
         }  catch (SQLException ex){
             System.out.println("Gagal Koneksi Database"+ ex);
         }
        return Inv_Connect;
      
    }
    
    
}

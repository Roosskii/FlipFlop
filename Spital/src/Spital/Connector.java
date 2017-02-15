package Spital;


import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liamsi
 */
public class Connector {
    Connection con;
    public Connector(){
    try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    }catch(ClassNotFoundException e){
    System.err.println(e);
    }
    try{
    con=DriverManager.getConnection("jdbc:oracle:thin://localhost:1521/XE","SERJ","Parolamea101");
    }catch(SQLException e){System.err.println(e);}
    }
    Connection obtainconnection(){return con;}
    
}

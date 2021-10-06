package com.tienda.database;



import java.sql.*;
public class Conexion {


    public static Connection obtenerConexion(){
        String url="jdbc:sqlserver://localhost:3306;"
                +"database=tienda"
                +"username=username;"
                +"password=password";
        try  {

            Connection con = DriverManager.getConnection(url);
            return con;
        }catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            System.out.println(e.toString());
            return null;
        }
    }

}

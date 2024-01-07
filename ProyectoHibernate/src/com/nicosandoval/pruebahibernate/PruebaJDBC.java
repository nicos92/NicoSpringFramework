package com.nicosandoval.pruebahibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebaJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/pruebashibernate?useSSL=false";
		String user = "root";
		String pass = "Password";
		try {
			
			System.out.println("intentando conectar con la BD " + url);
			
			Connection conn = DriverManager.getConnection(url, user, pass);
			
			System.out.println("Conexion Exitosa!");
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}

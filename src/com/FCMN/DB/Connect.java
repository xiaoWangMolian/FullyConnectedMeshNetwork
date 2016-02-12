package com.FCMN.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

	private static String url = "jdbc:mysql://127.0.0.1:3307/FullyConnectedMeshNetwork"; 
	private static String user = "root"; 
	private static String password = ""; 
	private static Connection conn = null; 
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	public static Connection getConnection() throws SQLException{
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	
	public static void releaseConn(ResultSet rs, Statement stmt, Connection conn){
		if (rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (stmt != null){
					try {
						stmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						if (conn != null){
							try {
								conn.close();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}
}

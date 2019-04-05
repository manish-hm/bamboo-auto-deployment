package com.ascend.nasm.CustomUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class DBConnect {
	
	private static String getEnv(String dbServer) {
		String businessUnit = "NASM-";
		return dbServer.contains("-") ? businessUnit.concat(dbServer.split("-")[1]) : dbServer;
	}

	public boolean getConnections(String databaseName) throws SQLException {
		String databaseServer = "****************";
		String connectionString = "jdbc:sqlserver://"+databaseServer+";user=analyticsapp;password=*********;database="+databaseName;
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionString);
			//JOptionPane.showMessageDialog(null, "Connection Established!!", getEnv(databaseServer), JOptionPane.INFORMATION_MESSAGE );
		} catch (Exception e) {
			//JOptionPane.showMessageDialog(null, e.getMessage(), getEnv(databaseServer), JOptionPane.ERROR_MESSAGE);
			return false;
		} finally {
			if(null!=con)
			con.close();
		}
		return true;

	}
	
	public static void main(String[] args) throws SQLException {
		new DBConnect().getConnections("PSI");
	}
}

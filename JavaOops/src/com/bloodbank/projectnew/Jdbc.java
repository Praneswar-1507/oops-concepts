package com.bloodbank.projectnew;

import java.sql.*;

public class Jdbc {
	        public static Connection getConnection() throws ClassNotFoundException, SQLException{
	            
	            Class .forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BloodBank","root","Eswar#07");
	            
	            return connection;
	        }
	        public static void update(String donorId,String donorName,String bloodType,int quantity)throws ClassNotFoundException,SQLException
	         {
	          Connection connection = getConnection();
	          String updateTable="update Bank set donor_name=?,quantity=? where donor_id=?";
	          PreparedStatement p= connection.prepareStatement(updateTable);
	          p.setString(3, donorId);
	         p.setString(1, donorName);
	         p.setInt(2, quantity);
	         int row=p.executeUpdate();
	         System.out.println("updated data:"+row);
	          connection.close();
	         }
	        public static void delete(String donorId)throws ClassNotFoundException,SQLException
	         {
	          Connection connection = getConnection();
	          String query="delete from Bank where donor_id=?";
	          PreparedStatement p= connection.prepareStatement(query);
	          p.setString(1,donorId);
	         int row= p.executeUpdate();
	         System.out.println("Deleted data: "+row);
	          connection.close();
	         }
	        public static void insert(String donorId,String donorName,String bloodType,int quantity)throws ClassNotFoundException,SQLException
	         {
	          Connection connection = getConnection();
	          String query="insert into Bank values(?,?,?,?)";
	          PreparedStatement p= connection.prepareStatement(query);
	          p.setString(1,donorId);
	          p.setString(2,donorName);
	          p.setString(3,bloodType);
	          p.setInt(4,quantity);
	        int row=  p.executeUpdate();
	        System.out.println("inserted data:"+row);
	          connection.close();
	         }
	     


	}



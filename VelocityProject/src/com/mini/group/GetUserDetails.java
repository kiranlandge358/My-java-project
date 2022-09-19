package com.mini.group;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GetUserDetails extends GetProductDetails {
	Connection con=null;
	PreparedStatement ps=null;
	public void insertUserData(String userfirstname,String userlastname,String email,long phone,String password) {
		try {
			ConnectionTest test=new ConnectionTest();
			con = test.getConnectionDetails();
			ps = con.prepareStatement("insert into userdetails (UserFirstName,UserLastName,UserEmail,UserPhone,password) values (?,?,?,?,?)");
			ps.setString(1, userfirstname);
			ps.setString(2, userlastname);
			ps.setString(3, email);
			ps.setLong(4, phone);
			ps.setString(5, password);
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate);
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	public void setUserDetails() throws SQLException
	{ 
		Scanner sc= null;
		GetUserDetails user =null;
		try {
			sc=new Scanner(System.in); 
			user=new GetUserDetails();
		for(int i=0;i<2;i++)
		{
			
			 
			System.out.println("Pleae Enter your first name:");
			String fname=sc.next();
			System.out.println("Please Enter your last name:");
			String lname=sc.next();
			System.out.println("Please Enter your email address");
			String email=sc.next();
			System.out.println("Please Enter your phone number:");
			int phn=sc.nextInt();
			System.out.println("Please Enter your password:");
			String password=sc.next();
			user.insertUserData(fname, lname, email, phn, password);
		}
		sc.close();
	}
		catch (Exception e) 
		{
			e.printStackTrace();
	    }
		finally
		{
			sc.close();
			user.con.close();
			user.ps.close();
		}
	}
	

}

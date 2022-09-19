package com.mini.group;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminDetails extends DisplayDetails{
	Connection con=null;
	PreparedStatement ps=null;
	public void insertAdminData(int id,String FirstName,String LastName,String Address,String Username,String password) {
		try {
			ConnectionTest test=new ConnectionTest();
			con = test.getConnectionDetails();
			ps = con.prepareStatement("insert into admindetails (AdminId,FirstName,LastName,Address,Username,password) values (?,?,?,?,?,?)");
			ps.setLong(1, id);
			ps.setString(2, FirstName);
			ps.setString(3, LastName);
			ps.setString(4, Address);
			ps.setString(5, Username);
			ps.setString(6, password);
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate);
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	public void setAdminDetils() throws SQLException
	{ 
		Scanner sc= null;
		AdminDetails admin=null;
		try {
			sc=new Scanner(System.in); 
		  admin=new AdminDetails();
		for(int i=0;i<1;i++)
		{
			
			System.out.println("Enter your ID:");
			int ID=sc.nextInt();
			System.out.println("Enter your FirstName:");
			String FirstName=sc.next();
			System.out.println("Enter your LastName:");
			String LastName=sc.next();
			System.out.println("Enter your Address:");
			String Address=sc.next();
			System.out.println("Enter your Username:");
			String Username=sc.next();
			System.out.println("Enter your Password:");
			String Password=sc.next();
			admin.insertAdminData(ID, FirstName, LastName, Address, Username, Password);
			 
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
			admin.con.close();
			admin.ps.close();
		}
	}
	
}

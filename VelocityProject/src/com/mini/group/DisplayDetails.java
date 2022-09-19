package com.mini.group;

import java.sql.SQLException;
import java.util.Scanner;

public class DisplayDetails {
	static {
		System.out.println("***************Welcome to E-Shopping*****************");
		System.out.println("-----------------------------------------------------");
		
	}
	 
	Scanner sc=new Scanner(System.in);
	public void diplay() throws SQLException
	{	 GetUserDetails us=new GetUserDetails();
		 GetProductDetails del=new GetProductDetails();
		 System.out.println("Please Select Option");
		 System.out.println("-----------------------------------------------------");
		 System.out.println("1.Enter One for Create New Admin account");
		 System.out.println("-----------------------------------------------------");
		 System.out.println("2.Enter two for Create new User account");
		 System.out.println("-----------------------------------------------------");
		 System.out.println("3.Enter three for Add products(Only for admin)");
		 System.out.println("-----------------------------------------------------");
		 System.out.println("4.Enter four for View All Products List");
		 System.out.println("-----------------------------------------------------");
		 int a=sc.nextInt();
		 if(a==1)
		 {
			 del.setAdminDetils();;
		 }
		 else if(a==2){
			 us.setUserDetails();
		 }
		 else if(a==3)
		 {
			 del.setProductDetails();
		 }
		 else if(a==4)
		 {
			 System.out.println("Please wait...");
		 }
	}
}

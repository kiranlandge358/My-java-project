package com.mini.group;

 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GetProductDetails extends  AdminDetails{
	Connection con=null;
	PreparedStatement ps=null;
	public  void insertProductData(int productid,String productname,String description,int price,int quantity) {
		try {
			ConnectionTest test=new ConnectionTest();
			con = test.getConnectionDetails();
			ps = con.prepareStatement("insert into productdetails (ProductId,ProductName,ProductDescription,ProductPrice,ProductQuantity) values (?,?,?,?,?)");
			ps.setLong(1, productid);
			ps.setString(2, productname);
			ps.setString(3, description);
			ps.setLong(4, price);
			ps.setLong(5, quantity);
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void setProductDetails() throws SQLException
	{ 
		Scanner sc= null;
		GetProductDetails details=null;
		try {
			sc=new Scanner(System.in); 
		  details=new GetProductDetails();
		for(int i=0;i<4;i++)
		{
			
			System.out.println("Enter Product id:");
			int productid=sc.nextInt();
			System.out.println("Enter Product Name:");
			String productName=sc.next();
			System.out.println("Enter Product Description:");
			String productDescription=sc.next();
			System.out.println("Enter Product Price:");
			int productPrice=sc.nextInt();
			System.out.println("Enter Product Quantity:");
			int productQuentity=sc.nextInt();
			details.insertProductData(productid, productName, productDescription, productPrice, productQuentity);
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
			details.con.close();
			details.ps.close();
		}
	}
	
}

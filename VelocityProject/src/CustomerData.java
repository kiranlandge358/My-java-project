package com.data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerData {
	public void method() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Detail","root","Chinku@358");
			PreparedStatement ps= connection.prepareStatement("insert into user(ProductID,NameProduct,Desciption,Quantity,Price)values(?,?,?,?,?)");
			ps.setString(1, "1064");
			ps.setString(2, "laptop");
			ps.setString(3, "HP15S-eq2143au AMD Ryzen 3 3300u 15.6 inch Notebook Laptop(8GB/512GB SSD/WINDOWS 11/Natural Silver/1.69kg");
			ps.setString(4, "10");
			ps.setString(5, "45990");
			ps.execute();
			ps.setString(1, "456");
			ps.setString(2, "Iphone");
			ps.setString(3, "Dual 12Mp Cameras(Ultra Wide,wide) 62GB,6.1-INCH(15.5cm)Liquid Retina HD LCD disply with True Tone");
			ps.setString(4, "10");
		    ps.setString(4, "59910");
			ps.execute();
			ps.setString(1, "1007");
			ps.setString(2, "JBL");
			ps.setString(3, "Wireless Portable Bluetooth Speaker With Mic,WaterProof ,Audio Player,12 Inches");
			ps.setString(4, "10");
			ps.setString(5, "1099");
			ps.execute();
			ps.setString(1,"4578");
			ps.setString(2, " Watch");
			ps.setString(3, "Apple Watch Series7,Blue Aluminium Case,LTE and UMTS,Wi-fi 802.11b/g/n 2.4GHz,Bluetooth 5.0");
			ps.setString(4, "10");
			ps.setString(5, "45900");
			ps.execute();
			ps.setString(1,"7896");
			ps.setString(2, "Tablet");
			ps.setString(3, "Lenovo tab,10.1inch/25.65cm 4GB,64GB,WIFI+4G LTE Calling, 5Mp Front Camera 4GBRam");
			ps.setString(4, "10");
			ps.setString(5,"19555");
			ps.execute();
			ps.setString(1,"67349");
			ps.setString(2, "Hard Disk");
			ps.setString(3, "Automatic Backup,250 Bit AES Hardware Encryotion,2.7 Inches ");
			ps.setString(4, "10");
			ps.setString(5, "9699");
			ps.execute();
			ps.setString(1,"897");
			ps.setString(2, "Pen Drive");
			ps.setString(3,"SanDisk 512GB Ultra Luxe USB 3.0 ");
			ps.setString(4, "10");
			ps.setString(5, "5678");
			ps.execute();
			ps.setString(1, "903");
			ps.setString(2, "Camera");
			ps.setString(3, "Canon EOS 1500D 24.1Digital SLR Camera Black ,3Inches, Wifi Connector");
			ps.setString(4,"10");
			ps.setString(5, "38756");
			ps.execute();
			ps.setString(1,"6701");
			ps.setString(2, "AC");
			ps.setString(3,"SAMSUNG 1.5 Ton 5Star Split Inverter AC with WiFi-Connect ");
			ps.setString(4, "10");
			ps.setString(5, "43877");
			ps.execute();
			ps.setString(1,"7600");
			ps.setString(2, "Chimney");
			ps.setString(3,"Elica 90 cm 1200 m3/hr Filterless,Auto Clean Chimnet Touch Control,220 volts 188 Watts");
			ps.setString(4,"10");
			ps.setString(5, "25678");
			ps.execute();
			
			
			
		
			//int k =ps.executeUpdate();
			System.out.println("done");
			
			connection.close();
			ps.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		}
		

	public static void main(String[] args) throws SQLException {
CustomerData obj= new CustomerData();
obj.method();

	}

}

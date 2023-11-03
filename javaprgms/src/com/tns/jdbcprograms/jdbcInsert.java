package com.tns.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tns","root","Pavithra2611");
		Statement st=conn.createStatement();
		
		//execute the query
		
		String strDelete="Delete from books where Bookid=8";
		System.out.println("the sql statement is "+ strDelete+ "\n");
		int countdeleted=st.executeUpdate(strDelete);
		System.out.println(countdeleted + "records deleted\n");
		
		//inserting multiple records
		String strInsert= "insert into books values"+"(2,'it starts with us',200,2),"+"(3,'it ends with us',200,2)";
		System.out.println("the sql statement is "+ strInsert+ "\n");
		int countinserted=st.executeUpdate(strInsert);
		System.out.println(countinserted + "records inserted\n");
		
	String strSelect="select * from books";
	System.out.println("");
		ResultSet rst1=st.executeQuery(strSelect);
		
		while(rst1.next())
		{ int Bookid=rst1.getInt("Bookid");
			String Bookname=rst1.getString("Bookname");
		    int Price=rst1.getInt("Price");
		    int quantity=rst1.getInt("quantity");
		    System.out.println(Bookid+" "+ Bookname + " " + Price + " " +quantity);
		    
		}
	}
	catch(SQLException e)
	{
	e.printStackTrace();
	}

}
}

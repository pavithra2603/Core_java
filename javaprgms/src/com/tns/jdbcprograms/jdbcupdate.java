package com.tns.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcupdate
{
public static void main(String[] args) {
try
	{
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tns","root","Pavithra2611");
	Statement st=conn.createStatement();
	
	//execute the query
	
	String strUpdate="update books set price=300 where Bookid=2";
	System.out.println("the sql statement is "+ strUpdate);
	int countupdated=st.executeUpdate(strUpdate);
	System.out.println(countupdated + "records affected\n");
	//process the result
	String strSelect1= "select * from books where Bookid=2";
	ResultSet rst1=st.executeQuery(strSelect1);
	System.out.println("after update:");
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

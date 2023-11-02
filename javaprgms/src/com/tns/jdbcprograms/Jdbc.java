package com.tns.jdbcprograms;
import java.sql.*;
import javax.sql.*;
public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tns","root","Pavithra2611");
		Statement st=conn.createStatement();
		
		//execute the query
		String strSelect="select Bookid,Bookname,Price,quantity from books";
		System.out.println("the sql statement is"+strSelect);
		
		//process the result
		ResultSet rst=st.executeQuery(strSelect);
		System.out.println("the records are:");
		int rowCount=0;
		while(rst.next())
		{ int Bookid=rst.getInt("Bookid");
			String Bookname=rst.getString("Bookname");
		    int Price=rst.getInt("Price");
		    int quantity=rst.getInt("quantity");
		    System.out.println(Bookid+" "+ Bookname + " " + Price + " " +quantity);
		    ++rowCount;
		}
	}
catch(SQLException e)
{
	e.printStackTrace();
}

}
}
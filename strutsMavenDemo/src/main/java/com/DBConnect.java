package com;
import java.util.*; 
import java.sql.*;
public class DBConnect {
Connection cn=null;
ResultSet rs=null;
PreparedStatement ps=null;
public DBConnect()
{
	try{
	Class.forName("com.mysql.jdbc.Driver");  
	  
	 cn=DriverManager.getConnection("jdbc:mysql:///strut","root","");  
}
catch(Exception e){System.out.println("Error :"+e);}
}

public void insert(String fname,String fback)
{
	int i=0;
	try{
		ps =cn.prepareStatement("insert into struttable2(name,feedback) values (?, ?)");
		ps.setString(1,fname);
		ps.setString(2,fback);
		i=ps.executeUpdate();

	}
	catch(Exception e){System.out.println("Error................ :" + e);}
}

public ResultSet view() throws SQLException
{
try{
	ps=cn.prepareStatement("select * from struttable2");
	rs=ps.executeQuery();
}	
catch(Exception e){System.out.println("error..." + e);}
while(rs.next())
{System.out.println("name :" +rs.getString(2)+ "    feedback : " +rs.getString(3));}
return rs;

} 



}

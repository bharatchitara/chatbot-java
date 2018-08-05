package chatbot_test1;
import java.util.*; 
import java.sql.*;
import chatbot_test1.Secondinput;


public class Database extends Secondinput{
	Scanner sc = new Scanner(System.in);
	      
	        void create(){
	        	
	   System.out.println("\t\t\t\t\t\t 5 star : excellent");
	   System.out.println("\t\t\t\t\t\t 4 star : great");
	   System.out.println("\t\t\t\t\t\t 3 star : good  ");
	   System.out.println("\t\t\t\t\t\t 2 star : fair");
	   System.out.println("\t\t\t\t\t\t 1 star : poor");
	   System.out.println("\t\t\t\t\t\t enter your responce"); 
	   
	   String response = sc.nextLine();
	   while(!response.matches("[1-5]"))                                                     //regex are used to stop false inputs.
	    { 
		 System.out.println("please enter a number ranging {1 - 5} ");
		 response = sc.nextLine();
	    }
	   
	  System.out.println("\t\t\t\t\t\t your responce was submitted...Thank You");

}   
   public static void main(String[] args){
	   
   try
	{
	   Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3386/feedback","root","1234");
	
	Statement stmt =con.createStatement();
	//ResultSet rs =stmt.executeQuery("select * from one;");
	
	String sql= "insert into one " + "values ('name1' , 'email1' , 'responce');";
	stmt.executeQuery(sql);
	
	//while(rs.next())  
		//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
		}
	
	catch(Exception e){ 
		System.out.println(e);
	} 
	}
   
   
}
package chatbot_test1;
import java.util.*; 
import java.sql.*;
import java.lang.String;
import chatbot_test1.Secondinput;


public class Database extends Secondinput{
	Scanner sc = new Scanner(System.in);
	static String response;
   
	 void create(){
	   String resp;     	
	 
	   System.out.println("\t\t\t\t\t\t 5 star : excellent");
	   System.out.println("\t\t\t\t\t\t 4 star : great");
	   System.out.println("\t\t\t\t\t\t 3 star : good  ");
	   System.out.println("\t\t\t\t\t\t 2 star : fair");
	   System.out.println("\t\t\t\t\t\t 1 star : poor");
	   System.out.println("\t\t\t\t\t\t enter your response"); 
	   
	  resp = sc.nextLine();
	   while(!resp.matches("[1-5]"))                                                     //regex are used to stop false inputs.
	    { 
		 System.out.println("please enter a number ranging {1 - 5} ");
		 resp = sc.nextLine();
	    }
	   
	  System.out.println("\t\t\t\t\t\t your response was submitted...Thank You");
	   response = resp;
}   
   public static void main(String[] args){
	
       System.out.println(name_db);
	    System.out.println(email_db);
	     System.out.println(response);
 
	  try
	{
	   Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3386/feedback","root","1234");
	
	Statement stmt =con.createStatement();
   /*    name_db += name_db ;
       email_db += email_db;
	*/
	String sql= "insert into one values ('"+name_db+"','"+email_db+"','"+response+"')";
	stmt.executeUpdate(sql);
 	
		con.close();  
		}
	
	catch(Exception e){ 
		System.out.println(e);
	} 
	}
    }
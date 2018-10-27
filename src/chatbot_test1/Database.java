package chatbot_test1;
import java.util.*; 
import java.sql.*;
import java.lang.String;
import chatbot_test1.Secondinput;


public class Database extends Secondinput{
	Scanner sc = new Scanner(System.in);
	//static int response;
	static String response = null;
	 
	void create(){
	  
	
}   
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
		
	   System.out.println("\t\t\t\t\t\t enter your response"); 
	   System.out.println("\t\t\t\t\t\t 5 star : excellent");
	   System.out.println("\t\t\t\t\t\t 4 star : great");
	   System.out.println("\t\t\t\t\t\t 3 star : good  ");
	   System.out.println("\t\t\t\t\t\t 2 star : fair");
	   System.out.println("\t\t\t\t\t\t 1 star : poor");
	   
	   response = sc.nextLine();
		
	  // resp = sc.nextLine();
	   while(!response.matches("[1-5]"))                                                     //regex are used to stop false inputs.
	    { 
		 System.out.println("please enter a number ranging {1 - 5} ");
		 response = sc.nextLine();
	    }
	  
	   
	   
	   
       System.out.println(name_db);
	    System.out.println(email_db);
	    System.out.println(response);
 
	  try
	{
	   Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost/feedback","root","");
	
	Statement stmt =con.createStatement();
   String sql= "insert into one values ('"+name_db+"','"+email_db+"','"+response+"')";
	stmt.executeUpdate(sql);
 	
		con.close();  
		}
	
	catch(Exception e){ 
		System.out.println(e);
	} 
	}
    }

package chatbot_test1;
import java.util.*;
 
public class Secondinput {
	//   public static String name1 = null;
//	   public static String email1 = null;
	   String name =null;
       String email= null;
 
	Scanner sc =new Scanner (System.in);
	 
        void secondinput() {
         String movie =null;
   String mtype1="action";
   String mtype2="sci-fi";
   String mtype3="romantic";
   String mtype4="sci fi";
   
   System.out.println("\t\t\t\t\t\t tell me about yourself..");
   System.out.println("\t\t\t\t\t\t what is your name");
   name =sc.nextLine();
   
   
   if(!name.matches("[a-zA-Z]+")){
	   
	   System.out.println("\t\t\t\t\t\t don't enter space , numbers & special char.");
    }
   else
   {
	//  name1 = name;
   }
   
   System.out.println("\t\t\t\t\t\t please enter your email id");
   email = sc.nextLine();
   
   if(email.isEmpty()){
	    System.out.println("\t\t\t\t\t\t enter valid email like 'myname@domain.com'");
	    }
   
   else{
	  // email1 = email;
	   
   }
 try{                                                                                         //try - catch for timing delay
          Thread.sleep(1500);
             System.out.println("\t\t\t\t\t\t " + name +  " which kind of movies you like ");
             
    }
    
    catch(InterruptedException e){
    System.out.println(e);
            }
    
   movie = sc.nextLine();
   while(!movie.matches("[a-zA-Z]+"))                                                     
    {
     System.out.println("don't use numbers & special characters!");
     movie = sc.nextLine();    
     }
      
   if(movie.equals(mtype1) )                                                                                 //if else statement for movie type
   {  
       try{
           Thread.sleep(1500);
       
       System.out.println("\t\t\t\t\t\t top 3 upcoming movies this year");
             System.out.println("\t\t\t\t\t\t   * Mission impossibble");
             System.out.println("\t\t\t\t\t\t   * Skyscraper ");
             System.out.println("\t\t\t\t\t\t   * Johnny english");
       }
         catch(InterruptedException e){
          System.out.println(e);
            }
   }
   
   else if(movie.equals(mtype2) || movie.equals(mtype4)){
 try{
     Thread.sleep(1500);
 
       System.out.println("\t\t\t\t\t\t top 3 upcoming movies this year");
             System.out.println("\t\t\t\t\t\t    * Ant man & the wasp");
             System.out.println("\t\t\t\t\t\t    * Venom");
             System.out.println("\t\t\t\t\t\t    * Robot 2 ");
   }
   catch(InterruptedException e){
    System.out.println(e);
            }
   }
   
   else if( movie.equals(mtype3)){
     try{
         Thread.sleep(1500);
          System.out.println("\t\t\t\t\t\t top 3 upcoming movies this year");
          System.out.println("\t\t\t\t\t\t   * Student of the year 2");
          System.out.println("\t\t\t\t\t\t   * Dhadak");
          System.out.println("\t\t\t\t\t\t   * Midnight sun");
   
}
    catch(InterruptedException e){
     System.out.println(e);
   }     
   }
   
 else{ 
       try{
           Thread.sleep(2000);
       
   System.out.println("\t\t\t\t\t\t this movie type is not in my database..\n");
   }
   
   catch(InterruptedException e){
    System.out.println(e);
            }
   } 
  }
  }
 

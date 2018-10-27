
package chatbot_test1;
import java.util.*;
import java.lang.String;
 
public class Secondinput {
	   public static String name_db = null;
	   public static String email_db= null;
	   String name = null;
       String email= null;
 
	Scanner sc =new Scanner (System.in);
	 
        void secondinput() {
         String movie = null;
   String mtype1="action";
   String mtype2="sci-fi";
   String mtype3="romantic";
   String mtype5="horror";
   String mtype4="sci fi";
   String mtype6="scifi";
   String choice0=null;
   String choice3="yes";
   String choice4= "no";
   
   
   System.out.println("\t\t\t\t\t\t tell me about yourself..");
   System.out.println("\t\t\t\t\t\t what is your name");
   name =sc.nextLine();
   
   
   if(!name.matches("[a-zA-Z]+")){
	   
	   System.out.println("\t\t\t\t\t\t don't enter spaces , numbers & special char.");
    }
   else
   {
	  name_db = name;
   }
   
   System.out.println("\t\t\t\t\t\t please enter your email id");
   email = sc.nextLine();
   
   if(email.isEmpty()){
	    System.out.println("\t\t\t\t\t\t enter valid email like 'myname@domain.com'");
	    }
   
   else{
	  email_db = email;
	   
   }
 try{                                                                                         //try - catch for timing delay
          Thread.sleep(1500);
             System.out.println("\t\t\t\t\t\t " + name +  " which kind of movies you like ");
             System.out.println("\t\t\t\t\t\t action \t romantic \t scifi \t horror");
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
   try{
		 Thread.sleep(1500);
		 System.out.println("\t\t\t\t\t\t do you want to see the upcoming movies of your favourite zaner" );
	     choice0=sc.nextLine();
		 

	 }
	 catch(InterruptedException e){
		    System.out.println(e);
		            }

   if(choice0.equals(choice3)){
      
   if(movie.equals(mtype1) )                                                                                 //if else statement for movie type
   {  
       try{
           Thread.sleep(1500);
       
       System.out.println("\t\t\t\t\t\t top 10 upcoming action movies");
             System.out.println("\t\t\t\t\t\t   1. Thugs of hindostan");
             System.out.println("\t\t\t\t\t\t   2. Simmba ");
             System.out.println("\t\t\t\t\t\t   3. Johnny english");
             System.out.println("\t\t\t\t\t\t   4. Overload");
             System.out.println("\t\t\t\t\t\t   5. Robin hood");
             System.out.println("\t\t\t\t\t\t   6. Glass");
             System.out.println("\t\t\t\t\t\t   7. Godzilla");
             System.out.println("\t\t\t\t\t\t   8. John wich 3");
             System.out.println("\t\t\t\t\t\t   9. Aladdin");
             System.out.println("\t\t\t\t\t\t   10. Mortal Engine");
       }
         catch(InterruptedException e){
          System.out.println(e);
            }
   }
   
   else if(movie.equals(mtype2) || movie.equals(mtype4) || movie.equals(mtype6)){
 try{
     Thread.sleep(1500);
 
       System.out.println("\t\t\t\t\t\t top 10 upcoming sci-fi movies");
             System.out.println("\t\t\t\t\t\t   1. Avenger: Fallen Kingdom");
             System.out.println("\t\t\t\t\t\t   2. Captain Marvel");
             System.out.println("\t\t\t\t\t\t   3. Robot 2 ");
             System.out.println("\t\t\t\t\t\t   4. Aqua man");
             System.out.println("\t\t\t\t\t\t   5. Suicide Squad 2");
             System.out.println("\t\t\t\t\t\t   6. Star wars: episode 9");
             System.out.println("\t\t\t\t\t\t   7. Bumblebee");
             System.out.println("\t\t\t\t\t\t   8. Shazam");
             System.out.println("\t\t\t\t\t\t   9. Dark phoenix");
             System.out.println("\t\t\t\t\t\t   10. Future world");
   }
   catch(InterruptedException e){
    System.out.println(e);
            }
   }
   
   else if( movie.equals(mtype3)){
     try{
         Thread.sleep(1500);

         System.out.println("\t\t\t\t\t\t top 10 upcoming romantic movies this year");
         System.out.println("\t\t\t\t\t\t   1. Student of the year 2");
         System.out.println("\t\t\t\t\t\t   2. Jack & dill");
         System.out.println("\t\t\t\t\t\t   3. Ranjha refugee");
         System.out.println("\t\t\t\t\t\t   4. Marudhar Express");
         System.out.println("\t\t\t\t\t\t   5. Zero");
         System.out.println("\t\t\t\t\t\t   6. Kalank");
         System.out.println("\t\t\t\t\t\t   7. The aftermath");
         System.out.println("\t\t\t\t\t\t   8. Arjun patiala");
         System.out.println("\t\t\t\t\t\t   9. Sandeep aur pinky faraar");
         System.out.println("\t\t\t\t\t\t   10. Five feet apart");
         
}
    catch(InterruptedException e){
     System.out.println(e);
   }     
   }
   
   else if( movie.equals(mtype5)){
	     try{
	         Thread.sleep(1500);
	         System.out.println("\t\t\t\t\t\t top 10 upcoming horror movies ");
	          System.out.println("\t\t\t\t\t\t   1. Halloween");
	          System.out.println("\t\t\t\t\t\t   2. 3 from hell");
	          System.out.println("\t\t\t\t\t\t   3. Becoming");
	          System.out.println("\t\t\t\t\t\t   4. Bloodline");
	          System.out.println("\t\t\t\t\t\t   5. Crawl");
	          System.out.println("\t\t\t\t\t\t   6. Climax");
	          System.out.println("\t\t\t\t\t\t   7. Dead mall");
	          System.out.println("\t\t\t\t\t\t   8. Escape room");
	          System.out.println("\t\t\t\t\t\t   9. Hell fest");
	          System.out.println("\t\t\t\t\t\t   10. Heretiks");
	        
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
   else{
	   System.out.println("\t\t\t\t\t\t may be next time");
   }
        
   
   
/*   
   try{                                                                                         //try - catch for timing delay
       Thread.sleep(1500);
          System.out.println("\t\t\t\t\t\t do you like to talk about politics");
          //System.out.println("\t\t\t\t\t\t music \t food \t politics \t business");
          }

 
 catch(InterruptedException e){
 System.out.println(e);
         }

   String pol=null;
   String pol1= "yes";
  // String pol2= "no";
   
   
  if(pol.equals(pol1)){
	System.out.println("\t\t\t\t\t\t trading topics right now--");
	System.out.println("\t\t\t\t\t\t 1.Rafale Deal");
	System.out.println("\t\t\t\t\t\t 2.CBI Alok verma case");
	System.out.println("\t\t\t\t\t\t 3.Amartsar rail Accident");
	System.out.println("\t\t\t\t\t\t 4.Next PM");
	
	
  }
  else{
	  System.out.println("\t\t\t\t\t\t seems like you love to do more productive work instead of only talks..");
  }
  */ 
   }
  }
 

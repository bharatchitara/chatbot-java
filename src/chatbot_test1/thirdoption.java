
package chatbot_test1;
import java.util.*;
import javax.swing.JOptionPane;

class thirdoption {
    
    Scanner sc = new Scanner(System.in);
 void one(){
    try{
           Thread.sleep(1500);
       
     System.out.println("\t\t\t\t\t\t what is your favorite programming langage\n");
     }
     catch(InterruptedException e){
         System.out.println(e);
      }
     
     String p_lang= sc.nextLine();
     while(!p_lang.matches("[a-zA-Z]+"))                                                     
     {
         if(p_lang.contains("c++"))
         {
         System.out.println("try to enter cpp instead c++");
         }
       
         System.out.println("don't use numbers & special characters!");
    p_lang= sc.nextLine();
    }
     System.out.println("\t\t\t\t\t\t interest to see some facts about your favorite prog. language ?");
     System.out.println("\t\t\t\t\t\t YES\t\t\tNO");
     String choice= sc.nextLine();                                                                 //input for seeing facts 
     while(!choice.matches("[a-zA-Z]+"))                                                     
    {
     System.out.println("don't use numbers & special characters!");
     choice = sc.nextLine();    
     }
     
                                      
     String choice1="yes";
     String choice2= "no";
     
     
       String lang1="c";
       String lang2="cpp";
       String lang3="java";
       String lang4="python";
       String lang5="javascript";
       
     if(choice.equals(choice1))
     { 
   if(p_lang.equals(lang1))
   {
       JOptionPane.showMessageDialog(null,"c programming is the second most language for making projects");
   }
   
   else if(p_lang.equals(lang2)){
  JOptionPane.showMessageDialog(null,"The c++17 is the current version of c++ programming released in dec.2017");
          
   }
  
   else if(p_lang.equals(lang3)){
  JOptionPane.showMessageDialog(null,"java was the first portable programming langage when build");
  }   
  
   else if(p_lang.equals(lang4)){
   JOptionPane.showMessageDialog(null,"The average salary of python developer was 114000$ per annum in 2017.");
  }
  
   else if(p_lang.equals(lang5)){
   JOptionPane.showMessageDialog(null,"javascript can be use in both front end and back end programming very efficiently");
 }
   else{
     JOptionPane.showMessageDialog(null,"this language is not popular or may you spell it wrong....lol ");
       
   }}
 
     else
 {
     
     System.out.println("\t\t\t\t\t\t maybe later .....");
 }
}
 
 void two(){                                                                  

System.out.println("\t\t\t\t\t\t what is your current mood");
System.out.println("\t\t\t\t\t\t HAPPY\t\tANGRY\t\tCONFUSED");

String mood=sc.nextLine();       
     while(!mood.matches("[a-zA-Z]+"))                                                     
    {
     System.out.println("don't use numbers & special characters!");
     mood = sc.nextLine();    
     }
     
     String mood1="happy";
       String mood2="angry";
       String mood3= "confused";

    if(mood.equals(mood1) ){
        try{
            Thread.sleep(1500);
    System.out.println("\t\t\t\t\t\t a happy mood is a myth in ENGINEERING");
        }
        catch(InterruptedException e){
         System.out.println(e);
        }
  }
    else if(mood.equals(mood2)){
        try{
            Thread.sleep(1500);
            System.out.println("\t\t\t\t\t\t keep calm & fuck the life");
        }
  
        catch(InterruptedException e){
         System.out.println(e);
        }
    }
 
       else if(mood.equals(mood3)){
        try{
            Thread.sleep(1500);
            System.out.println("\t\t\t\t\t\t confused about what??");            //hold it..
            
        }
  
        catch(InterruptedException e){
         System.out.println(e);
        }
    }
 
    else{
    try{
        Thread.sleep(1500);
    System.out.println("\t\t\t\t\t\t I am still learning.....thank you");
    }
    

    catch(InterruptedException e){
         System.out.println(e);
        }
  }
} 
 
}
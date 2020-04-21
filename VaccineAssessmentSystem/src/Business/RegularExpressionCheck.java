/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Little Giants
 */
public class RegularExpressionCheck {
    public static int c=0;
    public static boolean findRE(String userName) {
        Pattern ptr = Pattern.compile("^([a-zA-Z\u0080-\u024F]+(?:. |-| |'))*[a-zA-Z\u0080-\u024F]*$", Pattern.CASE_INSENSITIVE);
       Matcher m = ptr.matcher(userName);
       if(m.find())
         return true;
       else 
           return false;
		
	}
    
      public static boolean IsValidName(String Name) {
        Pattern ptr = Pattern.compile("^([a-zA-Z\u0080-\u024F]+(?:. |-| |'))*[a-zA-Z\u0080-\u024F]*$", Pattern.CASE_INSENSITIVE);
       Matcher m = ptr.matcher(Name);
       if(m.find())
         return true;
       else 
           return false;
		
	}
    
    public static boolean isValidEmailAddress(String email){
          Pattern ptr = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
          Matcher m = ptr.matcher(email);
          if(m.find())
            return true;
          else 
              return false;
     }
    
    public static boolean isValidPassword(String password){
          Pattern ptr = Pattern.compile("^[a-zA-Z0-9]+$", Pattern.CASE_INSENSITIVE);
          Matcher m = ptr.matcher(password);
          if(m.find())
            return true;
          else 
              return false;
     }
    
    public static boolean isValidPhoneNum(String contactNum){
         Pattern ptr = Pattern.compile("[0-9]{10}");  //("^(\\d{10})$");
          Matcher m = ptr.matcher(contactNum);
          if(m.find())
            return true;
          else 
              return false;
     }
}

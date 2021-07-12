//Kayaen Jardine 217466749


import java.util.*;
import java.text.*;

public class practice{
	public static void main (String[]args){

   Scanner scan = new Scanner(System.in);
   ITEC1620 it = new ITEC1620();

   for (int i=1; i<=50; i++) {
     System.out.println("Enter family name");
     String fm = scan.next();
     System.out.println("Enter address");
     String a = scan.next();
     System.out.println("Enter telephone number");
     String tel = scan.next();
     Student s = new Student (fm, a, tel);
     it.addStudent(s);
   }

   for (int i=1; i<=50; i++) {
     Student rs = it.getStudent(i);
     if (rs.getName().charAt(0)=='M')
           System.out.println(rs.toString());
   }
  }
}


					
import java.text.NumberFormat;
import java.util.Scanner;

public class Fees{
  public static void main(String args[]){
    String f, prog;
    double fee;
    Scanner scan = new Scanner(System.in);
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    Fees fe = new Fees();

// do/while to force correct input

   do{
     System.out.println("Enter the Faculty: Business,Technology,Arts or -1 to stop");
     f = scan.next(); 
while (!f.equals(“Arts”)||(!f.equals(“Business”)||(!f.equals(“Technology”)||(!f.equals(“-1”));

// loop with sentinel -1

    while (! f.equals("-1")) {

// do/while to force correct input

        do{
         System.out.println("Enter Undergraduate or Graduate");
         prog = scan.next();
       while(!prog.equals(“Undergraduate”)|| !prog.equals(“Graduate”));

        fee = fe.getTuition(f, prog); 
        if (f.equals("Business"))  
             fee = fee*1.1;
       else if (f.equals("Technology")) 
             fee = fee * 1.2; 
       System.out.println(“For “+f+”at “+prog+” level the tuition is “+fmt.format(fee));


// do/while to force correct input
   
    do{
        System.out.println("Enter the Faculty: Business,Technology,Arts or -1 to stop");
        f = scan.next(); 
 while (!f.equals(“Arts”)||(!f.equals(“Business”)||(!f.equals(“Technology”)\\ (!f.equals(“-1”));

     } // end while
  }  // end main
}


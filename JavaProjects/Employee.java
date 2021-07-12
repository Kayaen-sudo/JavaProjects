
public class Employee {
   String name, job;  
   int yearsExperience;

   public Employee (String n, String j, int ye){
      name=n;
      job=j;
      yearsExperience=ye;
   } 

   public String getName(){
    return name;
   }

   public String getJob(){
    return job;
   }

   public int getYears(){
    return yearsExperience;
   }

   public int pay(){
     int payRate; 
     if (yearsExperience > 5){
       if (job.equals("Manager"))  
        payRate = 80000;
       else if (job.equals("Analyst"))
        payRate = 50000;
       else 
        payRate = 40000;
     } 
     else {
       if (job.equals("Manager"))  
        payRate = 70000;
       else if (job.equals("Analyst"))
        payRate = 40000;
       else 
        payRate = 30000;
     } 
     return payRate;
   }

   public String toString() {
     return name+" working as "+job+" has a salary=$"+ pay();
   } 
}
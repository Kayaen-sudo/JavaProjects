
 //imports the java class
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class tutorial9 {

	public static void main(String[]args){

			Scanner scan = new Scanner(System.in);

			int [] num = {33,44,11,22};
	
			for(int i =0;i < num.length-1;i++){
				for (int j = 0;j < num.length-1-i;j++){
					if(num[j] >num[j+1]){
						int temp = num[j];
						num[j] = num[j+1];
						num[j+1]=temp;
						
						System.out.println("  " + num[i] );
						
					}
				}
			}
			
	
	
 }
}

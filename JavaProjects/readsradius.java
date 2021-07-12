
import java.util.Scanner;
import java.text.DecimalFormat;

public class readsradius {

	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int r;
		float volume,surfacearea;
		System.out.print("ENTER THE RADIUS");
		r = scan.nextInt();
		
		volume = (float) (((4)*Math.PI*Math.pow(r, 3)))/(3);
		
		surfacearea = (float) (4*Math.PI*Math.pow(r, 2));
		
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println("THE VOLUME IS: " + fmt.format(volume));
		System.out.println("THE SURFACE AREA IS: " + fmt.format(surfacearea));
		
	
		
		
	}
	
	
	
}

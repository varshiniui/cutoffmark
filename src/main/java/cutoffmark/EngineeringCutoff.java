package cutoffmark;
import java.util.Scanner;
public class EngineeringCutoff {
public int CutoffMark (int Maths,int Physics,int Chemistry) {
	return (Maths/2)+(Physics/4)+(Chemistry/4);
}
public static void main (String [] args) {
	EngineeringCutoff cm = new EngineeringCutoff();
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Engineering CutOffMark");
	System.out.println("Enter Physics Mark:");
	int Physics = sc.nextInt():
	System.out.println("Enter Maths Mark:");
	int Maths = sc.nextInt();
	System.out.println("Enter Chemistry Mark");
	int Chemistry = sc.nextInt();
	System.out.print("Cutoff Mark is :");
	int cutoff = cm.CutoffMark(Maths,Physics,Chemistry);
	
	sc.close();
}
}

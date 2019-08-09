package homework;
import java.util.Scanner;
public class Homework_080102{
	public static void main(String []args){
		System.out.println(getValue());
	}
	public static double getValue(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("«Î ‰»ÎXµƒ÷µ£∫");
		double a = scanner.nextDouble();
		double y = Math.pow(a,2)-2*a+4;
		return y;
	}
}
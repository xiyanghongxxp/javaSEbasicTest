package homework;
import java.util.Scanner;
public class Homework_080104{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = 10;
		double c = a%b==0 ? a%b : a/b+1;
		System.out.println(c);
	}
}
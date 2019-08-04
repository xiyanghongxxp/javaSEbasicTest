import java.util.Scanner;
public class Homework_080103{
	public static void main(String []args){
		System.out.println(getValue1());
		System.out.println(getValue2());
	}
	public static double getValue1(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入X的值：");
		double a = scanner.nextDouble();
		double y = a%3;
		return y;
	}
	public static double getValue2(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入X的值：");
		double a = scanner.nextDouble();
		double b = a++;
		return b;
	}
}
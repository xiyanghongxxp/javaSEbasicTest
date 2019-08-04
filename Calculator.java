import java.util.Scanner;
public class Calculator{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("计算");
		System.out.print("请输入第一个数值：");
		double num1 = scanner.nextDouble();
		System.out.print("请输入第二个数值：");
		double num2 = scanner.nextDouble();
		System.out.print("计算结果为："+getSum(num1,num2));
	}
	public static double getSum(double num1,double num2){
		double sum = num1*num2;
		return sum;
	}
}
import java.util.Scanner;
public class Calculator{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("����");
		System.out.print("�������һ����ֵ��");
		double num1 = scanner.nextDouble();
		System.out.print("������ڶ�����ֵ��");
		double num2 = scanner.nextDouble();
		System.out.print("������Ϊ��"+getSum(num1,num2));
	}
	public static double getSum(double num1,double num2){
		double sum = num1*num2;
		return sum;
	}
}
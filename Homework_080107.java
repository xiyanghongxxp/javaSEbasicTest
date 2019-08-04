import java.util.Scanner;
public class Homework_080107{
    public static void main (String[] args){
		System.out.println("P1与P2之间的距离为："+getPosition());
    }
	public static double getPosition(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入P1的x轴的值:");
		double x1 = scanner.nextInt();
		System.out.println("请输入P1的y轴的值:");
		double y1 = scanner.nextInt();
		System.out.println("请输入P2的x轴的值:");
		double x2 = scanner.nextInt();
		System.out.println("请输入P2的y轴的值:");
		double y2 = scanner.nextInt();
		double p = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		return p;
	}
}
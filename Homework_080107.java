import java.util.Scanner;
public class Homework_080107{
    public static void main (String[] args){
		System.out.println("P1��P2֮��ľ���Ϊ��"+getPosition());
    }
	public static double getPosition(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������P1��x���ֵ:");
		double x1 = scanner.nextInt();
		System.out.println("������P1��y���ֵ:");
		double y1 = scanner.nextInt();
		System.out.println("������P2��x���ֵ:");
		double x2 = scanner.nextInt();
		System.out.println("������P2��y���ֵ:");
		double y2 = scanner.nextInt();
		double p = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		return p;
	}
}
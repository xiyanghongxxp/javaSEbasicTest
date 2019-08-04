import java.util.Scanner;
public class Homework_080106{
	public static void main(String []args){
		int a = 0;
		while(a != -1){
			Scanner scanner = new Scanner(System.in);
			int b = scanner.nextInt();
			if(b != -1){
				System.out.println("您输入的是："+b);
			}else{
				System.out.println("您已退出");
			}
		}
		
	}
}
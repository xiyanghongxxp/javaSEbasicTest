import java.util.Scanner;
public class Test_0802{
	public static void main(String []args){
		System.out.println("请选择题号：");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int sum = 0;
		switch(a/1){
			case 1:{
				System.out.println("while循环");
				int i = 1;
				
				while(i<=100){
					sum = sum + i;
					i++;
				}
				System.out.println(sum);
				break;
			}
			case 2:{
				System.out.println("for循环");
				for(int i = 0;i<=100;i++){
					
					sum = sum + i;
					System.out.println(sum);
				}
				break;
			}
			case 3:{
				System.out.println("do-while语句");
				int i = 1;
				do{
					System.out.print("do...");
					i++;
				}while(i<4);
				break;
			}
			case 4:{
				System.out.println("输入输出");
				int c = scanner.nextInt();
				System.out.println("您输入的："+c);
				break;
			}
			case 5:{
				System.out.println("循环取字符");
				char[]mfw = {};
				String num1 = "做一个不看人不看钱看命的洒脱之人";
				for(int i = 0;i<num1.length();i++){
					if(i%2==0){
					mfw = num1.charAt(i);
					System.out.println(mfw);
					break;
					}
				}
				break;
			}
			case 6:{
				System.out.println("正方形");
				break;
			}
			case 7:{
				System.out.println("九九乘法表");
				break;
			}
			case 8:{
				System.out.println("打印图形");
				break;
			}
			
		}
	}
}
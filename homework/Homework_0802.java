package homework;
import java.util.Scanner;
public class Homework_0802{
	public static void main(String []args){
		System.out.println("请选择题号：");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		switch(a/1){
			case 1:{
				System.out.println("练习1");
				String b ="统计一个字符在字符串中的所有位置";
				char[] c = b.toCharArray();;
				for(int i = 0; i<c.length; i++){
					if (c[i]=='字')
					System.out.println(i);
					
				}
				break;
			}
			case 2:{
				System.out.println("练习2");
				break;
			}
			case 3:{
				System.out.println("练习3");
				break;
			}
			case 4:{
				System.out.println("练习4");
				break;
			}
			case 5:{
				System.out.println("练习5");
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
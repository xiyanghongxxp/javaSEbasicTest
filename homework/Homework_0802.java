package homework;
import java.util.Scanner;
public class Homework_0802{
	public static void main(String []args){
		System.out.println("��ѡ����ţ�");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		switch(a/1){
			case 1:{
				System.out.println("��ϰ1");
				String b ="ͳ��һ���ַ����ַ����е�����λ��";
				char[] c = b.toCharArray();;
				for(int i = 0; i<c.length; i++){
					if (c[i]=='��')
					System.out.println(i);
					
				}
				break;
			}
			case 2:{
				System.out.println("��ϰ2");
				break;
			}
			case 3:{
				System.out.println("��ϰ3");
				break;
			}
			case 4:{
				System.out.println("��ϰ4");
				break;
			}
			case 5:{
				System.out.println("��ϰ5");
				break;
			}
			case 6:{
				System.out.println("������");
				break;
			}
			case 7:{
				System.out.println("�žų˷���");
				break;
			}
			case 8:{
				System.out.println("��ӡͼ��");
				break;
			}
			
		}
	}
}
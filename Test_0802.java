import java.util.Scanner;
public class Test_0802{
	public static void main(String []args){
		System.out.println("��ѡ����ţ�");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int sum = 0;
		switch(a/1){
			case 1:{
				System.out.println("whileѭ��");
				int i = 1;
				
				while(i<=100){
					sum = sum + i;
					i++;
				}
				System.out.println(sum);
				break;
			}
			case 2:{
				System.out.println("forѭ��");
				for(int i = 0;i<=100;i++){
					
					sum = sum + i;
					System.out.println(sum);
				}
				break;
			}
			case 3:{
				System.out.println("do-while���");
				int i = 1;
				do{
					System.out.print("do...");
					i++;
				}while(i<4);
				break;
			}
			case 4:{
				System.out.println("�������");
				int c = scanner.nextInt();
				System.out.println("������ģ�"+c);
				break;
			}
			case 5:{
				System.out.println("ѭ��ȡ�ַ�");
				char[]mfw = {};
				String num1 = "��һ�������˲���Ǯ����������֮��";
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
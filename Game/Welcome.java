package Game;
import java.util.*;
public class Welcome {
	private static Scanner scanner;
    private static Scanner scanner2;

    public static void main(String []args) {
		mainbody();
	}
	public static void mainbody() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("* ����һ��RGB��Ϸ  *");
		System.out.println("* ��1ѡ��ʼ��Ϸ  *");
		System.out.println("* ��2ѡ����Ϸ����  *");
		System.out.println("* ��3ѡ���˳���Ϸ  *");
		System.out.println("*******************");
		int a = scanner.nextInt();
		switch(a) {
			case 1:{
				caseA();
			}break;
			case 2:{
				
			}break;
			case 3:{
				System.exit(0);
			}break;
			default:
				System.out.println("��������,����������");
			break;
		}
	}
	public static void caseA() {
		scanner = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("* 1.ѡ���ɫ  *");
		System.out.println("*******************");
		System.out.println("*******************");
		System.out.println("* 2.������ɫ *");
		System.out.println("*******************");
		int b = scanner.nextInt();
		switch(b/1) {
			case 1:{
				caseB1();
			}break;
			case 2:{
				caseB2();
			}break;
		}
	}
	public static void caseB1() {
		scanner2 = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("* ��ѡ���ɫ  *");
		System.out.println("*******************");
		int f = scanner2.nextInt();
		switch(f) {
			case 1:{
				caseF1();
			}break;
		}
	}
	public static void caseF1() {
		System.out.println("*******************");
		System.out.println("*     �ǳ�:"+caseB2()[0]+"*");
		System.out.println("*     ����:"+caseB2()[1]+"*");
		System.out.println("*     �Ա�:"+caseB2()[2]+"*");
		System.out.println("*     ����");
		System.out.println("*     ����:"+caseB2()[3]+"*");
		System.out.println("*     ����:"+caseB2()[4]+"*");
		System.out.println("*     ����:"+caseB2()[5]+"*");
		System.out.println("*     ����:"+caseB2()[6]+"*");
		System.out.println("*     �ǻۣ�"+caseB2()[7]+"*");
		System.out.println("*******************");
	}
	public static void caseB2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("*   �������ǳ�        *");
		System.out.println("*******************");
		String name = scanner.next();
		String[]theName = new String[1];
		theName[0]=name;
		Gender();
		int d = scanner.nextInt();
		String[]Gender = new String[1];
		if(d==1) {
			Gender[0]="��";
		}else if(d==2) {
			Gender[0]="Ů";
		}else {
			System.out.println("��������������ѡ��");
			Gender();
		}
		Race();
		int m = scanner.nextInt();
		String[]race = new String[1];
		if(m==1) {
			race[0]="����";
		}else if(m==2) {
			race[0]="����";
		}else if(m==3) {
			race[0]="����";
		}else if(m==4) {
			race[0]="Ԫ��";
		}else if(m==5) {
			race[0]="����";
		}else {
			System.out.println("��������������ѡ��");
			Race();
		}
		System.out.println("*    �����ɹ�        *");
		int a =new Welcome().power();
		int b =new Welcome().power();
		int c =new Welcome().power();
		int j =new Welcome().power();
		int e =new Welcome().power();
		String[] nor=new String[8];
		nor[0]=name;
		nor[1]=Gender[0];
		nor[2]=race[0];
		nor[3]="������"+String.valueOf(a);
		nor[4]="���ݣ�"+String.valueOf(b);
		nor[5]="������"+String.valueOf(c);
		nor[6]="������"+String.valueOf(j);
		nor[7]="�ǻۣ�"+String.valueOf(e);
		System.out.println("*******************");
		System.out.println("*     �ǳ�          :"+theName[0]);
		System.out.println("*     �Ա�          :"+Gender[0]);
		System.out.println("*     ����          :"+race[0]);
		System.out.println("******* ����  *******");
		System.out.println("*����      :  "+a);
		System.out.println("*����      :  "+b);
		System.out.println("*����      :  "+c);
		System.out.println("*����      :  "+j);
		System.out.println("*�ǻ�      :  "+e);
		System.out.println("*******************");
		System.out.println();
		System.out.println("*******************");
		System.out.println("*   ����1���أ�    *");
		System.out.println("*******************");
		int f = scanner.nextInt();
		switch(f) {
			case 1:{
				caseA();
			}break;
			case 2:{
				System.out.println();
			}break;
	
		}
		
		
	}
	public static void Gender() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("*   ��ѡ���Ա�        *");
		System.out.println("* 1.���� 2.Ů��      *");
		System.out.println("*******************");
		
		
	}
	public static void Race() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("*   ��ѡ������        *");
		System.out.println("*  1.���� *");
		System.out.println("*  2.���� *");
		System.out.println("*  3.���� *");
		System.out.println("*  4.Ԫ�� *");
		System.out.println("*  5.���� *");
		System.out.println("*******************");
	}

	public static int power() {
		Random random = new Random();
		int a = random.nextInt(10000);
		return a;
	}
}

	
	
	
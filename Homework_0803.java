import java.util.*;
public class Homework_0803 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("һ��29��");
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
				System.out.println("��������5");
				char[]chs= {'ͳ','��','һ','��','��','��','��','��'};
				System.out.println(chs);
				break;
			}
			case 6:{
				System.out.println("����ַ�����λ��");
				char[] cbs= {'ͳ','��','һ','��','��','��','��','��'};
				for(int i=0;i<cbs.length;i++) {
					if(cbs [i] == '��') {
						System.out.println(i);
					}
				}
				break;
			}
			case 7:{
				System.out.println("���������ַ�����λ��");
				char[] cbs= {'ͳ','��','һ','��','��','��','��','��'};
				char imb = scanner.next().charAt(0);
				for(int i=0;i<cbs.length;i++) {
					if(cbs [i] == imb) {
						System.out.println(i);
					}
				}
				break;
			}
			case 8:{
				System.out.println("��ӡͼ��");
				System.out.println("����������");
				int line = scanner.nextInt(); // �����ε�������(5��5��)
				System.out.println("����������");
				int hine = scanner.nextInt();
				for (int i = 1; i <= line; i++) { // ������
				for (int j = 1; j <= hine; j++) { // ������
				if (i == 1 || i == line) { // ����ǵ�һ�л��������һ�����ӡ�Ǻ�
				System.out.print("*");
				} else if (j == 1 || j == hine) { // ����ǵ�һ�л��������һ�����ӡ�Ǻ�
				System.out.print("*");
				} else {
				System.out.print(" "); // ������ǵ�һ�С����һ�С���һ�С����һ�����ӡ�ո�
				}
				}
				System.out.print("\n"); // ����
				}
				break;
			}
			case 9:{
				System.out.println("��ӡ������");
				int line = 5; // �����ε�������(5��5��)
				for (int i = 1; i <= line; i++) { // ������
				for (int j = 1; j <= line; j++) { // ������
				if (i == 1 || i == line) { // ����ǵ�һ�л��������һ�����ӡ�Ǻ�
				System.out.print("*");
				} else if (j == 1 || j == line) { // ����ǵ�һ�л��������һ�����ӡ�Ǻ�
				System.out.print("*");
				} else {
				System.out.print(" "); // ������ǵ�һ�С����һ�С���һ�С����һ�����ӡ�ո�
				}
				}
				System.out.print("\n"); // ����
				}
				break;
			}
			case 10:{
				System.out.println("�žų˷���");
				for (int i = 1; i <=9; i++) {
				for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+" ");
				}System.out.println( );
				}
			}
			case 11:{
				System.out.println("��ӡҪ��ͼ��");
				int line = 11; // �����ε�������(5��5��)
				for (int i = 1; i <= line; i++) { // ������
				for (int j = 1; j <= line; j++) { // ������
				if (i == 1 || i == line) { // ����ǵ�һ�л��������һ�����ӡ�Ǻ�
				System.out.print("*");
				System.out.print(" ");							
				} else if (j == 1 || j == line) { // ����ǵ�һ�л��������һ�����ӡ�Ǻ�
				System.out.print("*");
				System.out.print(" ");				
				} else {
				System.out.print(" ");				
				System.out.print(" ");// ������ǵ�һ�С����һ�С���һ�С����һ�����ӡ�ո�
				}
				}
				System.out.print("\n"); // ����
				}
				break;
			}
			case 12:{
				System.out.println("�������");
				int[] arr = {1,2,3,4};
				System.out.println(Arrays.toString(arr));
				break;
			}
			case 13:{
				System.out.println("���鸴��");
				int[] arr = {1,2,3,4};
				int[] arr1 = new int[arr.length];
				for(int i =0; i<arr.length;i++) {
					arr1[i]=arr[i];
				}
				arr1[3]=321;
				System.out.println("arr1"+Arrays.toString(arr1));
				System.out.println("arr"+Arrays.toString(arr));
				break;
			}
			case 14:{
				System.out.println("���鸴�ƿ��1");
				int[] arr = {1,2,3,4};//��ʼ�����飻
				int[] arr1 = new int[4];//���������飬����4��
				
				
				System.arraycopy(arr,1,arr1,0,3);//ʹ��System.arraycopy���ƣ�
				System.out.println("arr1"+Arrays.toString(arr1));//�������arr1��
				break;
			}
			case 15:{
				System.out.println("���鸴�ƿ��2");
				int[] arr = {1,2,3,4};//��ʼ�����飻
				int[] arr1 = Arrays.copyOf(arr,4);//ʹ��Arrays.copyOf���ƣ�
				System.out.println("arr1"+Arrays.toString(arr1));//�������arr1��
				break;
			}
			case 16:{
				System.out.println("������չ");
				int[] arr = {1,2,3,4};//��ʼ�����飻
				int[] arr1 = Arrays.copyOf(arr,6);//ʹ��Arrays.copyOf���ƣ�
				System.out.println("arr1"+Arrays.toString(arr1));//�������arr1��
				int[] newArr =arr1;
				newArr[4]=5;
				newArr[5]=6;
				System.out.println("newArr"+Arrays.toString(newArr));//�������newArr��
				break;
			}
			case 17:{
				System.out.println("�ҳ����֡����ڵ�����λ��");
				char[] cbs= {'ͳ','��','һ','��','��','��','��','��','��','��','��','��','��','��','λ','��'};
				for(int i=0;i<cbs.length;i++) {
					if(cbs [i] == '��') {
						System.out.println(i); 
					}
				}
				break;
			}
			case 18:{
				System.out.println("10�Ľ׳�");
				//����
				break;
			}
			case 19:{
				System.out.println("����ϲ�");
				int[] A= {1,7,9,11,13,15,17,19};
				int[] B= {2,4,6,8,10};
				int[] c = new int[13];
				System.arraycopy(A,0,c,0,8);
				System.arraycopy(B,0,c,8,5);
				Arrays.sort(c);//�������򷽷���		
				System.out.print(Arrays.toString(c));				    
				break;
			}
			case 20:{
				System.out.println("ˮ�ɻ���");
				for(int i = 100;i<=999;i++) {
					int s1 = (int)Math.pow(i/100, 3);
					int s2 = (int)Math.pow(i%100/10, 3);
					int s3 = (int)Math.pow(i%10, 3);
					if(i==s1+s2+s3) {
						System.out.println(i);
					}
					
					
				}
				break;
			}
			case 21:{
				System.out.println("�ҳ�1000���ڵ���������");
				
				break;
			}
			case 22:{
				System.out.println("��10�η������?");
				double h=100;
				double l=0;
				for(int i = 1;i<=10;i++) {
					l +=h*Math.pow(0.5, i)*3.0;
				}System.out.println(l);
				break;
			}
			case 23:{
				System.out.println("������1~100���ۼ�ֵ����Ҫ���������и�λΪ3����");
				
				int sum3 = 0;
				for(int a1=1;a1<=100;a1++) {
					if(a1%10!=3) {
						sum3+=a1;
					}
					
				};
				System.out.println(sum3);
				break;
			}
			case 24:{
				System.out.println("��ӡ��ʮ�����������");
				
				break;
			}
			case 25:{
				System.out.println("����м��ֹ��򷽷�");
				           
				break;
			}
			case 26:{
				System.out.println("��ÿ���µ���������Ϊ����?");
				
				break;
			}
			case 27:{
				System.out.println("ʵ��ð��������ѡ������");
				
				break;
			}
			case 28:{
				System.out.println("������µ���ԭ���ڼ��ŵ���λ");
				
				break;
			}
			case 29:{
				System.out.println("��������");
				
				break;
			}
		}
	}

}

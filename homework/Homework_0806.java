package homework;
import java.util.*;

public class Homework_0806 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ϰ,ʮ����");
		System.out.println("��ѡ����ţ�");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		switch(a/1){
		case 1:{
			System.out.println("��ϰ��-2");
			
			break;
		}
		case 2:{
			System.out.println("�κ���ҵ.3");
			
			break;
		}
		case 3:{
			System.out.println("�κ���ҵ.4");
			
			break;
		}
		case 4:{
			System.out.println("�κ���ҵ.10");
			
			break;
		}
		case 5:{
			System.out.println("�κ���ҵ.14");
			
			break;
		}
		case 6:{
			System.out.println("�κ���ҵ.15")
			;
			break;
		}
		case 7:{
			System.out.println("�κ���ҵ.16");
			
			break;
		}
		case 8:{
			System.out.println("����κ���ҵ.1");
			int[] m = {10,20,30,40,50};
			System.out.print(Arrays.toString(m));
			break;
		}
		case 9:{
			System.out.println("����κ���ҵ.2");
			char[] m = {'n','e','u','s','o','f','t','e','d','u','c','a','t','i','o','n'};
			char[] c = new char [m.length];
			for(int i =0; i<m.length;i++) {
				c[i]=m[i];
			}System.out.print(Arrays.toString(c));
			break;
		}
		case 10:{
			System.out.println("����κ���ҵ.3");
			int[]m= {1,5,9,7,4,6,3,8,2};			
			Arrays.parallelSort(m);
			System.out.print(Arrays.toString(m));
			break;
		}
		case 11:{
			System.out.println("����κ���ҵ.4");
			
			break;
		}
		case 12:{
			System.out.println("����κ���ҵ.5");
			double[][]m= new double[5][4];
			
			break;
		}
		case 13:{
			System.out.println("����κ���ҵ.6");
			int[]m= {18,25,7,36,13,2,89,69};
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m.length-1;j++) {
					
				}
			}
			
			break;
		}
		case 14:{
			System.out.println("����κ���ҵ.7");
			
			break;
		}
		case 15:{
			System.out.println("����κ���ҵ.8");
			
			break;
		}
		case 16:{
			System.out.println("����κ���ҵ.9");
			int[]m= {-10,2,3,246,-100,0,5};
			double max=0;
			double min=0;
			double aver=0;
			double sum =0;
			Arrays.parallelSort(m);
			for(int i =0;i<m.length;i++) {
				sum+=m[i];
			}
			aver=sum/m.length;
			max=m[m.length-1];
			min=m[0];
			System.out.println("��Ϊ��"+sum);
			System.out.print("ƽ��ֵΪ��"+aver);
			System.out.println();
			System.out.print("���ֵΪ��"+max);
			System.out.println("");
			System.out.print("��СֵΪ��"+min);
			break;
		}
		case 17:{
			System.out.println("ѡ������");
			int[]m= {1,9,7,3,5,8,4};
			for(int i=0;i<m.length-1;i++) {
				for(int j=i+1;j<m.length;j++) {
					if(m[i]>m[j]) {
						int temp = 0;
						temp=m[i];
						m[i]=m[j];
						m[j]=temp;
					}
				}System.out.print(Arrays.toString(m));
			}
			
			break;
		}
		case 18:{
			System.out.println("ð������");
			int[]m= {1,9,7,3,5,8,4};
			for(int i=0;i<m.length-1;i++) {
				for(int j=0;j<m.length-1-i;j++) {
					if(m[j]>m[j+1]) {
						int temp = 0;
						temp=m[j];
						m[j]=m[j+1];
						m[j+1]=temp;
					}
				}System.out.print(Arrays.toString(m));
			}
			break;
		}
		case 19:{
			
			
			break;
		}
		
		}
	}

}

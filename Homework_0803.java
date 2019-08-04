import java.util.*;
public class Homework_0803 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("一共29题");
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
				System.out.println("创建数组5");
				char[]chs= {'统','计','一','个','字','符','串','中'};
				System.out.println(chs);
				break;
			}
			case 6:{
				System.out.println("输出字符所在位置");
				char[] cbs= {'统','计','一','个','字','符','串','中'};
				for(int i=0;i<cbs.length;i++) {
					if(cbs [i] == '中') {
						System.out.println(i);
					}
				}
				break;
			}
			case 7:{
				System.out.println("输出输入的字符所在位置");
				char[] cbs= {'统','计','一','个','字','符','串','中'};
				char imb = scanner.next().charAt(0);
				for(int i=0;i<cbs.length;i++) {
					if(cbs [i] == imb) {
						System.out.println(i);
					}
				}
				break;
			}
			case 8:{
				System.out.println("打印图形");
				System.out.println("请输入行数");
				int line = scanner.nextInt(); // 正方形的总行数(5行5列)
				System.out.println("请输入列数");
				int hine = scanner.nextInt();
				for (int i = 1; i <= line; i++) { // 控制行
				for (int j = 1; j <= hine; j++) { // 控制列
				if (i == 1 || i == line) { // 如果是第一行或者是最后一行则打印星号
				System.out.print("*");
				} else if (j == 1 || j == hine) { // 如果是第一列或者是最后一列则打印星号
				System.out.print("*");
				} else {
				System.out.print(" "); // 如果不是第一行、最后一行、第一列、最后一列则打印空格
				}
				}
				System.out.print("\n"); // 换行
				}
				break;
			}
			case 9:{
				System.out.println("打印正方形");
				int line = 5; // 正方形的总行数(5行5列)
				for (int i = 1; i <= line; i++) { // 控制行
				for (int j = 1; j <= line; j++) { // 控制列
				if (i == 1 || i == line) { // 如果是第一行或者是最后一行则打印星号
				System.out.print("*");
				} else if (j == 1 || j == line) { // 如果是第一列或者是最后一列则打印星号
				System.out.print("*");
				} else {
				System.out.print(" "); // 如果不是第一行、最后一行、第一列、最后一列则打印空格
				}
				}
				System.out.print("\n"); // 换行
				}
				break;
			}
			case 10:{
				System.out.println("九九乘法表");
				for (int i = 1; i <=9; i++) {
				for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+" ");
				}System.out.println( );
				}
			}
			case 11:{
				System.out.println("打印要求图形");
				int line = 11; // 正方形的总行数(5行5列)
				for (int i = 1; i <= line; i++) { // 控制行
				for (int j = 1; j <= line; j++) { // 控制列
				if (i == 1 || i == line) { // 如果是第一行或者是最后一行则打印星号
				System.out.print("*");
				System.out.print(" ");							
				} else if (j == 1 || j == line) { // 如果是第一列或者是最后一列则打印星号
				System.out.print("*");
				System.out.print(" ");				
				} else {
				System.out.print(" ");				
				System.out.print(" ");// 如果不是第一行、最后一行、第一列、最后一列则打印空格
				}
				}
				System.out.print("\n"); // 换行
				}
				break;
			}
			case 12:{
				System.out.println("数组迭代");
				int[] arr = {1,2,3,4};
				System.out.println(Arrays.toString(arr));
				break;
			}
			case 13:{
				System.out.println("数组复制");
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
				System.out.println("数组复制快捷1");
				int[] arr = {1,2,3,4};//初始化数组；
				int[] arr1 = new int[4];//创建空数组，长度4；
				
				
				System.arraycopy(arr,1,arr1,0,3);//使用System.arraycopy复制；
				System.out.println("arr1"+Arrays.toString(arr1));//输出数组arr1；
				break;
			}
			case 15:{
				System.out.println("数组复制快捷2");
				int[] arr = {1,2,3,4};//初始化数组；
				int[] arr1 = Arrays.copyOf(arr,4);//使用Arrays.copyOf复制；
				System.out.println("arr1"+Arrays.toString(arr1));//输出数组arr1；
				break;
			}
			case 16:{
				System.out.println("数组扩展");
				int[] arr = {1,2,3,4};//初始化数组；
				int[] arr1 = Arrays.copyOf(arr,6);//使用Arrays.copyOf复制；
				System.out.println("arr1"+Arrays.toString(arr1));//输出数组arr1；
				int[] newArr =arr1;
				newArr[4]=5;
				newArr[5]=6;
				System.out.println("newArr"+Arrays.toString(newArr));//输出数组newArr；
				break;
			}
			case 17:{
				System.out.println("找出’字’所在的所有位置");
				char[] cbs= {'统','计','一','个','字','符','串','中','字','所','在','的','所','有','位','置'};
				for(int i=0;i<cbs.length;i++) {
					if(cbs [i] == '字') {
						System.out.println(i); 
					}
				}
				break;
			}
			case 18:{
				System.out.println("10的阶乘");
				//不会
				break;
			}
			case 19:{
				System.out.println("数组合并");
				int[] A= {1,7,9,11,13,15,17,19};
				int[] B= {2,4,6,8,10};
				int[] c = new int[13];
				System.arraycopy(A,0,c,0,8);
				System.arraycopy(B,0,c,8,5);
				Arrays.sort(c);//引入升序方法；		
				System.out.print(Arrays.toString(c));				    
				break;
			}
			case 20:{
				System.out.println("水仙花数");
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
				System.out.println("找出1000以内的所有完数");
				
				break;
			}
			case 22:{
				System.out.println("第10次反弹多高?");
				double h=100;
				double l=0;
				for(int i = 1;i<=10;i++) {
					l +=h*Math.pow(0.5, i)*3.0;
				}System.out.println(l);
				break;
			}
			case 23:{
				System.out.println("求整数1~100的累加值，但要求跳过所有个位为3的数");
				
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
				System.out.println("打印出十行杨辉三角形");
				
				break;
			}
			case 25:{
				System.out.println("算出有几种购买方法");
				           
				break;
			}
			case 26:{
				System.out.println("问每个月的兔子总数为多少?");
				
				break;
			}
			case 27:{
				System.out.println("实现冒泡排序与选择排序");
				
				break;
			}
			case 28:{
				System.out.println("最后留下的是原来第几号的那位");
				
				break;
			}
			case 29:{
				System.out.println("传递数据");
				
				break;
			}
		}
	}

}

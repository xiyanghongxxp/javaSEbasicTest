package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
* @ClassName: Homework_0808_3
* @Description: 方法调用：冒泡排序
* @author neuedu_yjr
* @date 2019年8月9日 下午1:35:38
*
*/
public class Homework_0808_3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int[]f=new int[5];
        f[0]=a;
        f[1]=b;
        f[2]=c;
        f[3]=d;
        f[4]=e;
        System.out.print(Arrays.toString(bubble(f)));
    }
    public static int[]bubble(int[]a){
        for(int i=0;i<a.length-1;i++) {
            for(int j=0;j<a.length-1-i;j++) {
                if(a[j]>a[j+1]) {
                    int temp = 0;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }Arrays.toString(a);
        }
        return a;
        
    }

}

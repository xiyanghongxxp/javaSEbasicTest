package homework;

import java.util.Scanner;

/**
* @ClassName: Homework_0808_1
* @Description: 方法调用：判断该年是闰年还是平年
* @author neuedu_yjr
* @date 2019年8月9日 下午1:25:38
*
*/
public class Homework_0808_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int a =scanner.nextInt();
        System.out.println(judge(a));
    }
    public static String judge(int a) {
        String b ="ping";
        if(a%100==0) {
            if(a%400==0) {
                b="闰年";
            }else {
                b="平年";
            }
        }else {
            if(a%4==0) {
                b="闰年";
            }else {
                b="平年";}
        }
        
        return b ;
    }
}

package homework;
import java.util.Scanner;

/**
* @ClassName: Homewrok_0808
* @Description: �׳˵ķ�������
* @author neuedu_yjr
* @date 2019��8��9�� ����1:23:39
*
*/
public class Homewrok_0808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int a = scanner.nextInt();
        System.out.print(factorial(a));
    }
    public static int factorial(int a) {
        int b=1;
        for(int i =1;i<=a;i++) {
            b=b*i;
        }
        
        return b;
    }
}

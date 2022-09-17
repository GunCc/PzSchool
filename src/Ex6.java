import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println("i的阶乘是："+Ex6.fac(i));
    }
    public static long fac(int n){
        long sum=1;
        for(int i = 1; i<=n;i++){
            sum*=i;
        }
        return sum;
    }
}

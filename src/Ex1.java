import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner s = new Scanner(System.in);
        double res = getAbsoluteValue(s.nextDouble());
        System.out.println("您输入的结果绝对值为："+res);
    }

    // 求绝对值
    public static double getAbsoluteValue( double num){
        double res = Math.abs(num);

        return res;
    }
}

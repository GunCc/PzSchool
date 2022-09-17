import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径：");
        Scanner s = new Scanner(System.in);
        double res = getArea(s.nextDouble());
        System.out.println("结果是："+String.format("%.2f",res));
    }

    public static double getArea(double r){
        double res = r*r *3.14;
        return res;
    }
}

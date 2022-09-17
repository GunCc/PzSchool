import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("请输入一个年份：");
        Scanner s = new Scanner(System.in);
        boolean flag = nian(s.nextInt());
        if(flag) System.out.println("是闰年");
        else System.out.println("是平年");
    }
    public static boolean nian(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return  true;
        }else return false;
    }
}

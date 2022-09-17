import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数水花仙数：");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        boolean flag = shuihuaxian(i);
        if(flag) System.out.println("是水花仙数");
        else System.out.println("不是水花仙数");

    }

    public static boolean shuihuaxian(int x){

        boolean flag;
        int h,s,g;
        h = x/100;
        s = x/10%10;
        g = x%10;
        flag=(int)Math.pow(h,3)+(int)Math.pow(s,3)+(int)Math.pow(g,3) == x;

        return flag;
    }
}

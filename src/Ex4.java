import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.Arrays;
import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        Scanner s;
        System.out.println("请输入年份：");
        s = new Scanner(System.in);
        int year = s.nextInt();
        System.out.println("请输入月份：");
        s = new Scanner(System.in);
        int month = s.nextInt();
        int res = nianfen(year,month);
        System.out.println("结果是："+res);
    }

    /**
     *
     * @param x 年份
     * @param y 月份
     * @return 天数
     */
    public  static  int nianfen(int x,int y){
        int res = 0;
        int max_months[] = new int[]{1,3,5,7,8,10,12};
        int min_months[] = new int[]{4,6,9,11};
        if(useList(max_months,y)){
            res = 31;
        }else if(useList(min_months,y)){
            res = 30;
        } else if(y == 2){
           res =  nian(x) ? 29 : 28;
        };
        return res;
    }

    public static boolean nian(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return  true;
        }else return false;
    }

    public static boolean useList(int[] arr, int targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }
}

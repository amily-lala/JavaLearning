package Chapter3;

import java.util.Arrays;
import java.util.EnumMap;

public class Demo1 {
    static long totalNum;
    String name;
    public Demo1 (String name){}

    static {
        totalNum = 1000;
        System.out.println("run static code block!");
    }

    public static void main (String[] args) {

//        Demo1 p1 = new Demo1("HarryPotter");
//        Demo1 p2 = new Demo1("小白");
//        Demo1 p3 = new Demo1("改不完bug了");

//        String[] names = {"Hello","xiaoBai","xiaoXiao"};
//        String s = names[2];
//        names[2] = "Harry";
//        System.out.println(s);

        //数组的三种声明并赋值的方法
//        int[] scores;
//        scores = new int[]{22, 23, 24, 25, 26};
//
//        String[] users = new String[] {"xiaobai","Harry","xiaoxiao"};
//
//        int[] nums = new int[3];
//        nums[0] = 1;
//        nums[2] = 18;
//        nums[1] = 20;

//        String s = "hello" ;
//        s += 100;
//        int len = s.length();
//        System.out.println(len);

//        int[] x = {1,9,0,34,5,99};
//        Arrays.sort(x);
//        for (int a : x) {
//            System.out.println(a);
//        }
//
//        int t[] = {1,2,3,4,5};


        String s = "xxxxx#123#456#zzzzz";
        int n = s.indexOf("#");
        int k = s.indexOf("#",n+1);
        String str = s.substring(n+1,k);

        System.out.println(str);

    }
}

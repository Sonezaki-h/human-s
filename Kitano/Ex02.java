package Kitano;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
    /*String 型の変数 s に文字列を入力し、
    s の値を表示するプログラムを作成しなさい。 */

        String s ="Hello World";
        System.out.println(s);

    /* int 型の変数 x に数値を入力し、
    x の値を表示するプログラムを作成しなさい。*/

        int x = 3;
        System.out.println(x);

    /* int 型の変数 x に数値を入力し、
    x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。*/

        x=2;
        System.out.println("x:1乗,"+x);
        System.out.println("x:2乗,"+x*x);
        System.out.println("x:3乗,"+x*x*x);
        
    /*int 型の変数 x、y にそれぞれ数値を入力し、
    x と y の和、差（x－y）、積、商と余り(x÷y)、を表示するプログラムを作成しなさい。 */

        x = 3;
        int y = 5;

        System.out.println("和："+ (x+y));
        System.out.println("差："+ (x-y));
        System.out.println("積："+ x*y);
        System.out.println("商："+ x/y);
        System.out.println("余り："+ x%y);

    /*２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。
    ※ 計算は整数で行い、小数点以下は切り捨ててよい。 */

        int num1=2;
        int num2=3;
        System.out.println("平均値："+num1+num2/2);

    /* 年齢を訊ね、生まれてから現在までの、
    おおよその日数を表示するプログラムを作成しなさい。
    ※日数の計算は閏年等を考慮せず、年齢×365とする。*/

        int age = 25;
        System.out.println("生まれてからのおおよその日数は、"+age*365+"日です。");

    }

}

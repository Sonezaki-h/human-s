package Kitano;

public class Ex01 {
public static void main(String[] args) {
    //“Hello World”と表示するプログラムを作成しなさい。
    System.out.println("Hello World");

   /*  int 型の変数 x に数値 11 を代入し、
    x の値を“x=11”のように表示するプログラムを作成しなさい。*/

        int x =11;
        System.out.println("x="+x);

    /*int 型の変数 x、y に数値 13、17 を代入し、
    x、y の値を“x=13,y=17”のように表示するプログラムを作成しなさい。 */   

        int X = 13;
        int y = 17;
        System.out.println("X="+ x +"," + "y="+ y );

    /* int 型の変数 x に数値 13 と 17 の和を代入し、
    x の値を表示するプログラムを作成しなさい。*/
        X = X+y ;
        System.out.println(x);

    /*数値 13 と 17 の積を表示するプログラムを作成しなさい。
    ただし、変数を使用しないこと。 */
        System.out.println(x*y);

    /*次のプログラムを作成しなさい。
    int 型の変数 x に数値 7 を代入する。
    変数 x の値を 3 倍にする。
    変数 x の値を表示する。
    変数 x の値を半分（1/2）にする。
    変数 x の値を表示する。 */

        x =7;
        x=x*3;
        System.out.println(x);
        x=x/2;
        System.out.println(x);

    /* int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて
     x と y の値を表示するプログラムを作成しなさい。
    ※ xとy以外に、もうひとつ変数が必要となる。*/

        x=3;
        y=7;

        int i=x;
        x=y;
        y=i;
        System.out.println("x="+x+"y="+y);

    /*int 型の変数 x、y に数値 19、23 を代入し、
    その積を変数 z に代入して z の値を表示するプログラムを作成しなさい。 */

        x=19;
        y=23;
        int z=x*y;
        System.out.println(z);

    /* int 型の変数 x に任意の数値を代入し、
    x を 2 倍、3 倍、4 倍した結果を表示するプログラムを作成しなさい。*/

        x=3;
        System.out.println(x*2);
        System.out.println(x*3);
        System.out.println(x*4);

    /*int 型の変数 x に任意の数値を代入し、
    x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。 */

        x=2;
        System.out.println(x);
        System.out.println(x*x);
        System.out.println(x*x*x);

    /* int 型の変数 x に任意の数値を代入し、
    x を x より小さい任意の数値で割った商と余りを表示するプログラムを作成しなさい。*/

        x=6;
        System.out.print(x/5);
        System.out.println(" "+x%5);

    /*int 型の変数 x に任意の数値を代入し、インクリメント演算子、デクリメント演算子を適用して
    結果を表示することにより演算子の効果を確認するプログラムを作成しなさい。 */

        x=6;
        System.out.println("x:初期値 "+x);
        
        int x1 = ++x;
        System.out.println(x1);

        int x2= --x;
        System.out.println(x2);

    

        


}
}

package Kitano;

public class Ex03 {
    public static void main(String[] args) {
    
    /*int 型の変数 x、y にそれぞれ数値を入力し、x が y より大きい場合に、
    “xはyより大きい。”という文を表示するプログラムを作成しなさい。 */

    int x=2;
    int y=3;
    
    if (x>y){
        System.out.println("xはyより大きい。");
    }

    /*２つの整数値を入力し、
    大きい方（小さくない方）の数を表示するプログラムを作成しなさい。 */

    x=5;
    y=8;

    if(x>y){
        System.out.println("x=5");
    } else {
        System.out.println("y=8");
    }

    /* int 型の変数 x、y にそれぞれ数値を入力し、
    x が ｙ より大きい場合には“xはyより大きい”、
    x が y より小さい場合には“xはyより小さい”と表示するプログラムを作成しなさい。*/

     x=3;
     y=5;
     
     if(x>y){
        System.out.println("xはyより大きい");
     } else {
        System.out.println("xはyより小さい");
     }

     /*int 型の変数 x、y にそれぞれ数値を入力し、
     x が ｙ より大きい場合には“xはyより大きい”、
     x が y より小さい場合には“xはyより小さい”、
     x と y が等しい場合には“xとyは等しい”と表示するプログラムを作成しなさい。 */

     x=10;
     y=10;

     if(x>y){
        System.out.println("xはyより大きい");
     } else if (x<y) {
        System.out.println("xはyより小さい");        
     } else{
        System.out.println("xとyは等しい");
     }

     /*正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
    ※ 奇数、偶数の判定には除算の余りを利用する。 */

    x=13;

    if (x%2==0){
        System.out.println("ｘは偶数です。");
    } else {
        System.out.println("ｘは、奇数です。");
    }

    /*整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
    “正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
    ※ 負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
    ※ 0 は“正の偶数”であるとする。*/

    int num1=0;
    
    if(num1<0 && num1%2==0){
        System.out.println("負の偶数");
    } else if(num1>=0 && num1%2==0){
        System.out.println("正の偶数");
    } else if(num1<0){
        System.out.println("負の奇数");
    } else{
        System.out.println("正の奇数");
    }

    /*試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
    試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします。 */

    int num2=63;

    /*ケース1
    60 点以上：“合格”
    60 点未満：“不合格” */  

    if(num2>=60){
        System.out.println("合格");
    } else {
        System.out.println("不合格");
    }

    /* ケース2
    80 点以上：“たいへんよくできました。”
    60 点以上、80 点未満：“よくできました。”
    60 点未満：“ざんねんでした。”*/

    if(num2>=80){
        System.out.println("たいへんよくできました");

    } else if(60 <= num2 && num2< 80){
        System.out.println("よくできました");

    } else {
        System.out.println("ざんねんでした。");
    }


    /* ケース3
    80 点以上：“優”
    70 点以上、80 点未満：“良”
    60 点以上、70 点未満：“可”
    60 点未満：“不可”*/

    if(num2 >= 80){
        System.out.println("優");
    } else if(70 <= num2 && num2 <80 ){
        System.out.println("良");
    } else if(60 <= num2 && num2 <70){
        System.out.println("可");
    } else{
        System.out.println("不可");
    }

    /*中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、
    次の条件に従って合格、不合格を判定するプログラムを作成しなさい。
     両方とも 60 点以上の場合、合格
    合計が 130 点以上の場合、合格
    合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格
    上記以外は不合格*/

    int num3=88; //中間
    int num4=32; //期末

    if(num3 >= 60 && num4 >=60 || num3+num4 >= 130){
        System.out.println("合格");
    } else if(num3+num4 >= 100 && num3 >=90 || num4 >= 90){
        System.out.println("合格");
    } else{
        System.out.println("不合格");
    }

    /* 曜日と、午前、午後、夜間の区別を入力し、
    病院が開いているか、休診であるかを表示するプログラムを作成しなさい。*/

    int weekday = ;
    


    }

}

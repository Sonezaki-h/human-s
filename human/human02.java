package human;

import java.util.ArrayList;
import java.util.List;

public class human02 {
//alt + shift + oでimportを出現させる

    public static void main(String[] args) {
        List<Human01> humanList = new ArrayList<>();
        
        humanList.add(new Human01("田中", 24, "男性"));
        humanList.add(new Human01("佐藤", 23, "女性"));
        humanList.add(new Human01("山田", 22, "男性"));
        
        for (Human01 human:humanList){
            System.out.println(human.getName()+"です。"+human.getAge()+"才"+human.getGender()+"です。");
        }
//toStringとセット
        for (Human01 human:humanList){
            System.out.println(human.toString());
        }
        
    }
}

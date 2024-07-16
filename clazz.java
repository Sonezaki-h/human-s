import java.net.InterfaceAddress;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import human.Human01;

public class clazz {

    private List<Human> members;

    // 男性のみの人数
    public int getMensNum() {
        int num = 0;

        for (Human human : members) {
            if ("男性".equals(human.getGender())) {
                num++;
            }
        }
        return num;
    }

    // 女性のみの人数
    public int getWomensNum() {

        int num = 0;
        for (Human human2 : members) {
            if ("女性".equals(human2.getGender())) {
                num++;
            }
        }
        return num;
    }

    public List<Human> getMembers() {
        return members;
    }

    public void setMembers(List<Human> members) {
        this.members = members;
    }

    // 男性の平均年齢を求める
    public double getMensAgeAverage() {

        double num2 = 0.0;
        for (Human human : members) {
            if ("男性".equals(human.getGender())) {
                num2 += human.getAge();
            }
        }
        return num2 / getMensNum();
    }

    // 女性の平均年齢を求める
    public double getWomenAgeAverage() {

        double num2 = 0.0;
        for (Human human : members) {
            if ("女性".equals(human.getGender())) {
                num2 += human.getAge();
            }
        }
        return num2 / getWomensNum();
    }



    
    public static void main(String[] args) {
        ArrayList<Human> clazzList = new ArrayList<>();

        clazzList.add(new Human("大島", "1997-09-19", "女性"));
        clazzList.add(new Human("福田", "1998-07-13", "女性"));
        clazzList.add(new Human("曽根崎", "2000-01-07", "女性"));
        clazzList.add(new Human("安西", "1999-06-22", "女性"));
        clazzList.add(new Human("林", "1999-05-01", "男性"));
        clazzList.add(new Human("新竹", "1996-07-15", "男性"));
        clazzList.add(new Human("川口", "1998-04-30", "男性)"));
        clazzList.add(new Human("矢ヶ崎", "1997-06-24", "男性"));

        System.out.println(clazzList);
    }

}

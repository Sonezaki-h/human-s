package human;

public class Human01 {
private String name;
private int age;
private String gender;

//右クリックで、SetとGetを出す
public Human01(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
}
public String getName() {
    return this.name;
}
public int getAge() {
    return this.age;
}
public String getGender() {
    return this.gender;
}
public void setName(String name) {
    this.name = name;
}
public void setAge(int age) {
    this.age = age;
}
public void setGender(String gender) {
    this.gender = gender;
}

//オーバーライト（すべての要素を文字列に変換してくれるので時短できる）
@Override
public String toString() {
    // TODO Auto-generated method stub
    return name+"です。"+age+"才"+gender+"です。";
}

}

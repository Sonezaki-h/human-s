import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javax.swing.text.DateFormatter;

public class Human {
    String name;
    String birthday;
    String gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }


public Human(String name,String birthday,String gender){
    this.name = name;
    this.birthday=birthday;
    this.gender = gender;
} 
  

public LocalDate getLocalDateBirthday(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return LocalDate.parse(this.birthday,formatter);
   
   }
   

public int getAge(){

   LocalDate now = LocalDate.now();
   int age = now.getYear()


   
    
    

   }
}
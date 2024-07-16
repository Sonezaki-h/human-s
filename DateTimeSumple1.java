import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeSumple1 {
public static void main(String[] args) {

//.nowで現在情報を取る（newは使わない！）
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);

// .ofで日にちの指定をする
    LocalDate localDate2 = LocalDate.of(2024,07,01);
    System.out.println(localDate);
    int year = localDate.getYear();
    int month = localDate.getMonthValue();
    int day = localDate.getDayOfMonth();

    System.out.println(year);
    System.out.println(month);
    System.out.println(day);

    //３０日後をlocalDate2として上書きする
    localDate2 = localDate.plusDays(30);
    System.out.println(localDate2);

    //with で
    localDate3 = localDate.getDayOfMonth();
    System.out.println(localDate3);

    public class DateTimeSample5{
        public static void main(String[] args) {
            LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println(localDate);
            DateTimeFormatter
            =("yyyy年MM月dd日HH時mm分ss秒");
            String format = localDateTime.format(formatter);
            System.out.println(format);
        }
    }
}
}
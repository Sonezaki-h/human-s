import java.time.LocalDate;

public class Ex07 {
    public static void main(String[] args) {

        LocalDate localData2 = LocalDate.of(2000,01,07);

        int year = localData2.getYear();
        int month = localData2.getMonthValue();
        int day = localData2.getDayOfMonth();

        System.out.println("私の誕生日は"+year+"年"+month+"月"+day+"日です");
        }
    }
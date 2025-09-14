package LW_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q6{
    public static void main(String[] args) {

        LocalDate dateNow=LocalDate.now();
        DateTimeFormatter style=DateTimeFormatter.ofPattern("d MMMM yyyy");

        String result=dateNow.format(style);
        System.out.println(result);
    }
}

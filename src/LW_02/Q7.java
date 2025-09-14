package LW_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q7{
    public static void main(String[] args) {

        LocalDate dateNow=LocalDate.now();
        DateTimeFormatter style=DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");

        String result=dateNow.format(style);
        System.out.println(result);
    }
}


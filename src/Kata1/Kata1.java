package Kata1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

public class Kata1 {
    public static void main(String[] args) {
        try{
            Person person = new Person("LUis", LocalDate.of(20, Month.APRIL, 14));
            System.out.println(person.getName()+ " " + person.getAge());
        }catch (DateTimeException e){
            System.out.println("Fecha incorrecta");
        }
    }
}
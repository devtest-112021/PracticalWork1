package work32;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        int  stavka= 12;

        Scanner scan=new Scanner(System.in);
        System.out.println("Введите сумму дипозита: ");
        int summa = scan.nextInt();

        Scanner scan2=new Scanner(System.in);
        System.out.println("Введите количеcтво месяцев: ");
        int month = scan2.nextInt();

        double doxod=(summa * stavka * (month * 1.0 / 12)) / 100;

        System.out.println("Доход за" + " " + month + " " + "месяцев составляет: "+ doxod +" грн" );

    }

}

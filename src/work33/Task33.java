package work33;

public class Task33 {
    public static void main(String[] args) {
        int price=830;
        int down=13;
        int up=7;
        double  resultDownPrice=830 - ((price*down * 1.0) / 100);
        double resultUpPrice=830 - (resultDownPrice * up) / 100;


        System.out.println("Цена после падение на 13%:  " + resultDownPrice +" $");
        System.out.println("Цена после поднятия на 7%:  " + resultUpPrice +" $");
    }

}

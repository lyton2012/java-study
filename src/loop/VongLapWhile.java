package loop;

import java.util.Scanner;

public class VongLapWhile {
    public static void main(String[] args) {
        String rep = "Y";
        Scanner sc = new Scanner(System.in);
        while (rep.equalsIgnoreCase("y"))
        {
            System.out.println("Wonderful");
            System.out.println("Moi ban chon Y/N?");
            rep = sc.nextLine();
        }
        System.out.printf("Ket Thuc");
    }
}

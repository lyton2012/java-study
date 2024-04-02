package bai_tap;

import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        float vnd;
        float rate;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Hay nhap tien vdn: ");
        vnd= sc.nextFloat();
        System.out.printf("Hay nhap ty gia: ");
        rate= sc.nextFloat();
        System.out.printf("So tien USD la: "+(vnd/rate));
        //in co dinh dang
        System.out.printf("\nTien VND=%.1f - Ty gia=%.1f - Tien USD=%.1f", vnd,rate,(vnd/rate));
    }
}

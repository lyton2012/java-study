package Methods;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    Scanner sc = new Scanner(System.in);

    public float enter(String msg) {
        System.out.print(msg);
        return sc.nextFloat();
    }
    public void solve(float a, float b){
        if ( a==0) System.out.print("\nPTVN");
        else System.out.printf("\nx = %.2f",(-b/a));
    }

    public static void main(String[] args) {
        GiaiPhuongTrinhBacNhat obj = new GiaiPhuongTrinhBacNhat();
        float a = obj.enter("Enter a: ");
        float b = obj.enter("Enter b: ");
        System.out.printf("%.2fx + %.2f = 0",a,b);
        obj.solve(a,b);

    }
}

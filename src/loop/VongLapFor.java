package loop;

public class VongLapFor {
    public static void main(String[] args) {
        int s = 0, i;
        for (i = 1; i < 10; i += 2) {
            s = s + i;
        }
        System.out.printf("s = " + s);
    }
}

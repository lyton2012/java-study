package toan_tu;

public class ToanTuBaNgoi {
    public static void main(String[] args) {

        int day = 7;
        String result = (day % 2 == 0) ? "so chan" : "so le";
        System.out.printf(result);
    }
}

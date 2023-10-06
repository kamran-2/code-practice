package leetcode;

import java.util.Scanner;

class p {
    public static void main(String arr[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        p P = new p();
        String a  = P.convertToTitle(num);
        System.out.println(a);
    }

    public String convertToTitle(int columnNumber) {
        String sc = "";
        if (columnNumber < 27) {
            int ch = columnNumber + 64;
            sc = ch + "";
        }else {
            int q = (columnNumber / 26) + 64;
            int r = (columnNumber % 26) + 64;
            sc = (char)q + "" + (char)r;
        }
        return sc;
    }
}
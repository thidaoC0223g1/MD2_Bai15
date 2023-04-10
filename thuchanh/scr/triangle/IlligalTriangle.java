package triangle;

import java.util.Scanner;

public class IlligalTriangle {
    static class NotATriangle extends Exception {
        public NotATriangle(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao a");
        int a = input.nextInt();
        System.out.println("nhap vao b");
        int b = input.nextInt();
        System.out.println("nhap vao c");
        int c = input.nextInt();

        triangleCheck(a, b, c);
    }

    public static void triangleCheck(int a, int b, int c) {
        try {
            if (a > 0 && b > 0 && c > 0 && (a + b) > c && (b + c) > a && (a + c) > b) {
                System.out.println("a,b,c la canh cua 1 tam giac");
            }else{throw new NotATriangle("3 canh khong phai canh cua tam giac.");}
        } catch (NotATriangle e) {

            System.err.println(e.getMessage());

        }
    }

}


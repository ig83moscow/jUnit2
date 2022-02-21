package org.example;
import java.util.Scanner;
public class TriangleSquareCalculation {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Сторона a=5");
        int a=sc.nextInt();

        System.out.println("Сторона b=7");
        int b=sc.nextInt();

        System.out.println("Сторона c=9");
        int c=sc.nextInt();

        int p = (a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Площадь треугольника = " + s);

        sc.close();
    }
}

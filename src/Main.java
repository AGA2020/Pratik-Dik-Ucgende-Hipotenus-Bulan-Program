//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b ,c;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Tabanın uzunluğunu giriniz : " );
        a = girdi.nextInt();
        System.out.print("Dik kenarın uzunluğunu giriniz : " );
        b = girdi.nextInt();
        double ckare = (a*a + b*b);
        c =  Math.sqrt (ckare);
        System.out.print("Hipotenüsün uzunluğu : " + c);
    }
}
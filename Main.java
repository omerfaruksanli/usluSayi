import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("üSSÜ ALINACAK SAYIYI GİRİNİZ : ");
        a = input.nextInt();
        System.out.print("ÜSSE ALINACAK DEĞERİ GİRİNİZ : ");
        b = input.nextInt();
        int total = 1 ;

        for (int i=1; i<= b; i++ ){
            total*=a;

        }
        System.out.print("Sonuç : " + total);


    }
}
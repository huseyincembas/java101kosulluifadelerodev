import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik, derssayisi = 0;
        double average;

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        if(mat <= 100 && mat >= 0){
            derssayisi++;
        }else {
            mat = 0;
        }

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if(fizik <= 100 && fizik >= 0){
            derssayisi++;
        }else {
            fizik = 0;
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if(turkce <= 100 && turkce >= 0){
            derssayisi++;
        }else {
            turkce = 0;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if(kimya <= 100 && kimya >= 0){
            derssayisi++;
        }else {
            kimya = 0;
        }

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        if(muzik <= 100 && muzik >= 0){
            derssayisi++;
        }else {
            muzik = 0;
        }

        average = (mat + fizik + turkce + kimya + muzik) / derssayisi;
        System.out.println("Ortalamanız= " + average);
        if(average >= 55){
            System.out.print("Sınıfı Geçtiniz.");
        }else {
            System.out.print("Sınıfta Kaldınız.");
        }
    }
}
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);

       int n1, n2, select;
       System.out.print("İlk sayıyı giriniz: ");
       n1 = inp.nextInt();
       System.out.print("İkinci sayıyı giriniz: ");
       n2= inp.nextInt();

       System.out.println("İşlem Seçimi\n1- Toplama\n2- Çıkartma\n3- Çarpma\n4- Bölme");
       System.out.print("Seçiminiz: ");
       select = inp.nextInt();

       switch (select){
          case 1:
             System.out.print("Sonuç: " + (n1 + n2));
             break;
          case 2:
             System.out.print("Sonuç: " + (n1 - n2));
             break;
          case 3:
             System.out.print("Sonuç: " + (n1 * n2));
             break;
          case 4:
             switch (n2){
                case 0:
                   System.out.print("Bölme işleminde ikinci sayı 0 olamaz.");
                   break;
                default:
                   System.out.print("Sonuç: " + (n1 / n2));
             }
             break;
          default:
             System.out.print("Yanlış seçim yaptınız.");
       }
    }
}
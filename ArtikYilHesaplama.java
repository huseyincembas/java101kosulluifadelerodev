import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();
        if (year%400 == 0) {
            System.out.print(year + " bir artık yıldır.");
        } else if (year%100 == 0) {
            System.out.print(year + " bir artık yıl değildir.");
        } else if (year%4 == 0) {
            System.out.print(year + " bir artık yıldır.");
        }else {
            System.out.print(year + " bir artık yıl değildir.");
        }
    }
}
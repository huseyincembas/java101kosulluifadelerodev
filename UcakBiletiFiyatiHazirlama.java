import java.util.Scanner;
public class UcakBiletiFiyatiHazirlama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, flightType, length;
        double ageDiscount, total, discountTotal, flightDiscountTotal;

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        length = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        flightType= input.nextInt();

        if((age < 0) || (length < 0 || (flightType > 2) || (flightType < 1) )){
            System.out.print("Hatalı Veri Girdiniz !");
        }
        else {
            total = (length*0.10);
            if (age < 12) {
                ageDiscount = total*0.50;
                discountTotal = total - ageDiscount;
                if(flightType == 1){
                    System.out.print("Toplam Tutar: " + discountTotal);
                }else {
                    flightDiscountTotal = discountTotal*0.20;
                    System.out.print("Toplam Tutar: " + flightDiscountTotal);
                }
            } else if (age<= 24) {
                ageDiscount = total*0.10;
                discountTotal = total - ageDiscount;
                if(flightType == 1){
                    System.out.print("Toplam Tutar: " + discountTotal);
                }else {
                    flightDiscountTotal = discountTotal*0.20;
                    System.out.print("Toplam Tutar: " + flightDiscountTotal);
                }
            } else if (age <=65) {
                if(flightType == 1){
                    System.out.print("Toplam Tutar: " + total);
                }else {
                    flightDiscountTotal = total*0.20;
                    System.out.print("Toplam Tutar: " + flightDiscountTotal);
                }
            }else {
                ageDiscount = total*0.30;
                discountTotal = total - ageDiscount;
                if(flightType == 1){
                    System.out.print("Toplam Tutar: " + discountTotal);
                }else {
                    flightDiscountTotal = discountTotal*0.20;
                    System.out.print("Toplam Tutar: " + flightDiscountTotal);
                }
            }
        }
    }
}
import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;
        String burc = "";

        System.out.print("Doğduğunuz Gün: ");
        day = input.nextInt();
        System.out.print("Doğduğunuz Ay: ");
        month = input.nextInt();

        if((month == 1) && (day>=1) && (day<=31)){
            if(day <= 21){
                burc = "Oğlak";
            }
            else {
                burc = "Kova";
            }
        }

        if((month == 2) && (day>=1) && (day<=31)){
            if(day <= 19){
                burc = "Kova";
            }
            else {
                burc = "Balık";
            }
        }

        if((month == 3) && (day>=1) && (day<=31)){
            if(day <= 20){
                burc = "Balık";
            }
            else {
                burc = "Koç";
            }
        }

        if((month == 4) && (day>=1) && (day<=31)){
            if(day <= 20){
                burc = "Koç";
            }
            else {
                burc = "Boğa";
            }
        }

        if((month == 5) && (day>=1) && (day<=31)){
            if(day <= 21){
                burc = "Boğa";
            }
            else {
                burc = "İkizler";
            }
        }

        if((month == 6) && (day>=1) && (day<=31)){
            if(day <= 22){
                burc = "İkizler";
            }
            else {
                burc = "Yengeç";
            }
        }

        if((month == 7) && (day>=1) && (day<=31)){
            if(day <= 22){
                burc = "Yengeç";
            }
            else {
                burc = "Aslan";
            }
        }

        if((month == 8) && (day>=1) && (day<=31)){
            if(day <= 22){
                burc = "Aslan";
            }
            else {
                burc = "Başak";
            }
        }

        if((month == 9) && (day>=1) && (day<=31)){
            if(day <= 22){
                burc = "Başak";
            }
            else {
                burc = "Terazi";
            }
        }

        if((month == 10) && (day>=1) && (day<=31)){
            if(day <= 22){
                burc = "Terazi";
            }
            else {
                burc = "Akrep";
            }
        }

        if((month == 11) && (day>=1) && (day<=31)){
            if(day <= 21){
                burc = "Akrep";
            }
            else {
                burc = "Yay";
            }
        }

        if((month == 12) && (day>=1) && (day<=31)){
            if(day <= 21){
                burc = "Yay";
            }
            else {
                burc = "Oğlak";
            }
        }

        if(month > 12 || month < 1 || day > 31 || day < 1){
            System.out.print("Hatalı giriş yaptınız.");
        }else {
            System.out.print("Burcunuz: " + burc);
        }
    }
}
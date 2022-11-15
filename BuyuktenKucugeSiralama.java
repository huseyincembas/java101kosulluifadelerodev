import java.util.Scanner;
public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz(n1): ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz(n2): ");
        n2 = input.nextInt();

        System.out.print("Üçüncü sayıyı giriniz(n3): ");
        n3 = input.nextInt();

        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.print("n1 < n2 < n3");
            }else {
                System.out.print("n1 < n3 < n2");
            }
        } else if (n2 < n1 && n2 < n3) {
            if(n1 < n3){
                System.out.print("n2 < n1 < n3");
            }else{
                System.out.print("n2 < n3 < n1");
            }
        }else {
            if(n2 < n1){
                System.out.print("n3 < n2 < n1");
            }else{
                System.out.print("n3 < n1 < n2");
            }
        }
    }
}
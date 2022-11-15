import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklığı Giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayağa gidebilirsiniz.");
        } else if (heat <= 15) {
            System.out.print("Sinemaya gidebilirsiniz.");
        } else if (heat <= 25) {
            System.out.print("Pikniğe gidebilirsiniz.");
        }else {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }
}
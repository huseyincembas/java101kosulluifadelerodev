import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int select;

        System.out.print("Kullanıcı Adınız: ");
        userName = inp.nextLine();
        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if(!((userName.equals("patika")) && (password.equals("java101")))){
            System.out.print("Şifrenizi sıfırlama ister misiniz?\n1- Evet\n2- Hayır\nSeçiminiz: ");
            select = inp.nextInt();
            inp.nextLine();

            if (select == 1){
                System.out.print("Yeni Şifrenizi Giriniz:" +
                        "");
                String newPassword = inp.nextLine();

                if (newPassword.equals("java101")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.print("Şifre oluşturuldu.");
                }

            } else if (select == 2) {
                System.out.print("Tekrar giriş yapmayı deneyebilirsiniz.");
            } else {
                System.out.print("Hatalı seçim yaptınız.");
            }

        }else {
            System.out.print("Giriş yaptınız.");
        }
    }
}
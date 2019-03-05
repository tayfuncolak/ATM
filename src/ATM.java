
import java.util.Scanner;


public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("DoymazBank'a Hoşgeldiniz...");
        System.out.println("*******************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*******************************");
        int giris_hakki = 3;
        
        while (true) {            
           if (login.login(hesap)){
               System.out.println("Giriş Başarılı");
               break;
           }
           else {
               System.out.println("Giriş Başarısız");
               giris_hakki -= 1;
               System.out.println(giris_hakki + " giriş hakkınız kaldı.");
           }
           if (giris_hakki == 0){
               System.out.println("Giriş hakkınız bitmiştir.");
               return;
           }     
        }
        System.out.println("*****************************");
        String islemler = "Bakiye Görüntülemek için 1'e\n"
                        + "Para yatırmak için 2'ye\n"
                        + "Para çekmek için 3'e \n"
                        + "Çıkış İçin q'ya basın";
        System.out.println(islemler);
        System.out.println("*****************************");
        while (true) {            
            System.out.println("İşlem Seçiniz");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            }
            else if (islem.equals("2")) {
                System.out.print("Yatırmak istediğiniz tutarı girin.");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);           
            }
            else if (islem.equals("3")) {
                System.out.print("Çekmek istediğiniz tutarı girin.");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}

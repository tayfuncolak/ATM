
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap("Tayfun", "1234", 1500);
        atm.calis(hesap);
        System.out.println("İşlemleriniz tamamlandı. ATM den çıkış yapılıyor...");
    }
    
}

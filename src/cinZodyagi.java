import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int birthYear;
        String burc = "";

        System.out.print("Doğum yılınızı giriniz : ");
        birthYear = inp.nextInt();

        switch (birthYear % 12) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                System.out.print("Hata!");
        }
        System.out.print("Çin Zodyağı burcunuz : " + burc);
    }
}

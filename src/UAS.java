import java.util.ArrayList;
import java.util.Scanner;

public class UAS {
    public static void main(String[] args) {
        int jum = 4;
        UADID myMessage = new UADID();
        Scanner sc = new Scanner(System.in);
        myMessage.setMESSAGENAME(sc.nextLine());
        ArrayList<String> context = new ArrayList<>();
        for (int index=0; index<jum;index++){
            context.add(sc.nextLine());
        }
        myMessage.setCONTEXT(context);
        System.out.println("Kata yang dicari : ");
        String cari = sc.nextLine();
        System.out.println(myMessage.FindWords(context, cari));
    }
}

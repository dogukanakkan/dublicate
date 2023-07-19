import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı dizisinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Sayıları girin:");
        for (int i = 0; i < boyut; i++) {
            dizi[i] = scanner.nextInt();
        }

        Map<Integer, Integer> tekrarEdenSayilar = new HashMap<>();

        for (int sayi : dizi) {
            if (sayi % 2 == 0) {
                if (tekrarEdenSayilar.containsKey(sayi)) {
                    int tekrarSayisi = tekrarEdenSayilar.get(sayi);
                    tekrarSayisi++;
                    tekrarEdenSayilar.put(sayi, tekrarSayisi);
                } else {
                    tekrarEdenSayilar.put(sayi, 1);
                }
            }
        }

        System.out.println("Tekrar Eden Çift Sayılar:");
        for (Map.Entry<Integer, Integer> entry : tekrarEdenSayilar.entrySet()) {
            int sayi = entry.getKey();
            int tekrarSayisi = entry.getValue();
            System.out.println(sayi + " - Tekrar Sayısı: " + tekrarSayisi);
        }

    }
}
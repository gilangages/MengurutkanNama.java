import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class mengurutkanNama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList <String> names = new ArrayList<>();
        System.out.print("Berapa nama yang ingin diinputkan: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i=1;i<=n;i++) {
        System.out.print("Masukkan nama ke-"+i+": ");
        String nama = input.nextLine();
        
        names.add(nama);
        System.out.println("-----------------------------------");
        }

        System.out.println("=================================");
        System.out.println("Nama sebelum pengurutan: ");
        for (String name : names ) {
            System.out.println(name);
        }

        //proses
        Collections.sort(names);
        System.out.println("===================================");
        //setelah pengurutan
        System.out.println("Nama setelah pengurutan: ");
        for (String name : names) {
            System.out.println(name);
        }
        input.close();
    }
}

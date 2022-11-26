package lekcijaDivi.labDarbs.majasDarbs;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        // 1.uzdevums
        int x = 1;
        System.out.println(x > 0);
        System.out.println(x < 0);
        x = 6;
        System.out.println(x > 5 && x <= 10);
        x = 6;
        System.out.println(!(x <= 5 && x < 10));
        x = 6;
        System.out.println(x == 0 || x == 10);
        x = 10 * 10;
        System.out.println(x > 10);

        // 2.uzdevums

        int monthNumber = 2;
        switch (monthNumber) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
        }
// 3.uzdevums
        int skaitlis1 = 1;
        int skaitlis2 = 2;
        int skaitlis3 = 3;

        if (skaitlis3 > skaitlis2 && skaitlis3 > skaitlis1) {
            System.out.println("Lielakais skaitlis ir " + "skaitlis3 ");
        }
// 4.uzdevums

        String luksaforaKrasa = "green";
        if (luksaforaKrasa.equals("green")) {
            System.out.println("Ej");
        }
        String luksaforaKrasa1 = "red";
        if (luksaforaKrasa1.equals("red")) {
            System.out.println("Stavi");
        }
        String luksaforaKrasa2 = "yellow";
        if (luksaforaKrasa2.equals("yellow")) {
            System.out.println("Gaidi");
        }
        //nedeg neviena gaisma(skaties zimes)
        else {
            System.out.println("skaties zimes");
        }
    }
}


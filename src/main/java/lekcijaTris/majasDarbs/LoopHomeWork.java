package lekcijaTris.majasDarbs;

import java.util.Scanner;

public class LoopHomeWork {

    public static void main(String[] args) {
        veselSkaitlis();
        whilecikls();
        summa();
    }


public static void summa(){
        Scanner scannerInt = new Scanner(System.in);
        int intSum = 0;
        System.out.println("Programma nolasa veselus skaitļus un sasummē, līdz summa pārsniedz 100");
        int enteredNumber = scannerInt.nextInt();
        while (enteredNumber <= 100) {
            intSum = intSum + enteredNumber;
            System.out.println("Tekošā ievadīto skaitļu summa ir " + intSum);
            System.out.println("Programma nolasa veselus skaitļus līdz 100");
            enteredNumber = scannerInt.nextInt();
        }
        if (enteredNumber == 0) {
            System.out.println("Ievadīta" + enteredNumber);
        }
        System.out.println("Ievadīto pozitīvo skaitļu summa ir " + intSum);
        System.out.println("Gatavs");
    }

    public static void whilecikls() {
        int[] dzivnieki = {5, 17, 5, 2,};
        int x = 0;
        System.out.println("\nMūsu mājsaimniecībā ir dažadu mājdzīvnieku skaits : ");
        do {
            System.out.print(dzivnieki[x] + ";");
            x++;
        } while (x < dzivnieki.length);
        System.out.println();
    }


    public static void veselSkaitlis() {
        int[] veselSkaitlis = new int[100];
        for (int z = 0; z < veselSkaitlis.length; z = z + 1) {
            veselSkaitlis[z] = z * 2;
            System.out.print(veselSkaitlis[z] + " ; ");
        }


        String[] dzivnieki1 = {"Gotiņas", "Vistas", "Trūši", "Sūni"};
        System.out.println("\n \nMūsu ganāmpulks ;): ");
        int y = 0;
        while (y < dzivnieki1.length) {
            System.out.println(dzivnieki1[y]);
            y++;
        }

        char[] modelis = {'B', 'M', 'W'};
        System.out.println("\nVārds no burtiem - auto: ");
        for (char burts : modelis) {
            System.out.print(burts);
        }
        System.out.println();
    }

        }




































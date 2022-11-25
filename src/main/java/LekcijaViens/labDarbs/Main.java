package LekcijaViens.labDarbs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//int-integer, satur veselu skaitlis

        int cikAraIrGradi = 10;
        int temperatura = -10;
        System.out.println("ziema būs " + temperatura);

        int vecums = 34;
        System.out.println("Mans vecums ir:" + vecums);
        int garums = 162;
        System.out.println("Mans garums ir:" + garums);
        int kurpjuIzmers = 37;
        System.out.println("Mans kurpjuIzmers ir:" + kurpjuIzmers);
        int darbaStazs = 25;
        System.out.println("Mans darbaStazs ir:" + darbaStazs);
        int svars = 75;

        //Maksimālā integer vērtība
        int maxInt = 2147483647;
        //Min integer vērtība
        int minInt = -2147483648;

        //pienem veselu skaitli no -127 līdz +127
        byte vecumsDivi = 99;

        short latvijasMazpilseta = 17000;

        long zivisOkeana = 21474836499L;

        System.out.println("Mans svars ir:" + svars);
        System.out.println("VECUMS:" + vecums + "\nGARUMS: " + garums + "\nKurpju izmers:" + kurpjuIzmers);

        //
String sunaVards = "Remarks";
boolean vaiIrPotets = true;

if (vaiIrPotets==true){
    System.out.println("Remarks drīkst brauk uz ārzemēs");
}
if (vaiIrPotets==false){
    System.out.println("Remarkam ātri jāiet pie vētārsta");
}

String teksts = "Suna vārds ir: ";
        System.out.println(teksts + sunaVards);

        String favoriteQuote = "To be or not to be";
        System.out.println(favoriteQuote);

        float apavuIzmers= 37.5F;
        System.out.println("apavuIzmers " + apavuIzmers);

        double grauduSvars = 150.3;
        System.out.println("Tika pārdoti " + grauduSvars + "kg graudi");

        //Šodien ir sestdiena, lielveikals ir atvērts
        boolean isSuperMarketOpen = true;
        //Turprētim skolas ie slēgtas
        boolean isSchoolOpen = false;

        System.out.println("Vai veikals ir atvērts? " + isSuperMarketOpen);

        boolean isFebruaris = false;
        boolean isLeapYear = true;

        String sunaSkirne = "VAS";
        char valuta = '$';
        char atzime = 'F';
        char dzimums = 'V';

        System.out.println("test" + valuta + atzime + dzimums);

int a = 5;
int b = 10;
        int summa;
        summa = a + b;

        System.out.println(summa);

        summa = a + a;

        System.out.println(summa);

        String name = "Juris";
        System.out.println(name);
        name = "Jānis";
        System.out.println(name);

        int x = 10;
        int y = -45;

        int rezultats = x + y;
        System.out.println(rezultats);

        rezultats = x - y;
        System.out.println(rezultats);

        rezultats = x * y;
        System.out.println(rezultats);

        rezultats = 10 / 2;
        System.out.println(rezultats);

        rezultats = 11 % 2;
        System.out.println(rezultats);

        rezultats = 5*(3+7)/2;
        System.out.println(rezultats);

        rezultats = 5*(3+7)/4;
        System.out.println(rezultats);



    }
}

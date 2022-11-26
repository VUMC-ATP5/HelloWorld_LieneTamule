package LekcijaViens.majasDarbs;

public class FirstClass {
    public static void main(String[] args) {

        String valstaNosaukums = "Amerika";
        String teksts = "valsts nosaukums ir: ";
        System.out.println(teksts + valstaNosaukums);

        long iedzivotajuSkaits = 306000000L;
        String teksts1 = "iedzivotaju skaits ir: ";
        System.out.println(teksts1 + iedzivotajuSkaits);

        double platiba = 9.83;
        String teksts2 = "ar platibu: ";
        String teksts3 = " miljoniem km2" ;
        System.out.println(teksts2  + platiba + teksts3 );

        String galvasPilsetasNosaukums = "Vasingtona";
        String teksts4 = "galvaspilsetas nosaukums ir: ";
        System.out.println(teksts4 + galvasPilsetasNosaukums);

        String oficialaValoda = "anglu";
        String teksts5 = "oficiala valoda: ";
        System.out.println(teksts5 + oficialaValoda);

        boolean VaiIrESDalibValsts = false;
        System.out.println("Vai ir ES dalibvalsts? " + VaiIrESDalibValsts);

        char valuta = '$';
        System.out.println(valuta);

        System.out.println("valsts nosaukums:" + valstaNosaukums + "\nplatiba: " + platiba + "\niedzivotajuSkaits:" + iedzivotajuSkaits);

        int x = 20;
        int y = 25;

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



    }
}


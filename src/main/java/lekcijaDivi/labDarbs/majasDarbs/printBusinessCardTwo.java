package lekcijaDivi.labDarbs.majasDarbs;

public class printBusinessCardTwo {
    public static void main(String[] args) {
        System.out.println();
        printBusinessCardTwo2("Liene", "Tamule", "+371 22305203", "1979");
        printBusinessCardTwo2("Artūrs", "Tamulis", "+371 00000000","2002");
        System.out.println();
    }
    public static void printBusinessCardTwo() {
        System.out.println("Vizītkarte");
        System.out.println("@@@@@@@@@@@@@");
        System.out.println("Vārds: Liene");
        System.out.println("Uzvārds: Tamule");
        System.out.println("Tālr.+371 22305203");
        System.out.println("Dz.gads: 1979");
        System.out.println("@@@@@@@@@@@@@");
    }
    public static void printBusinessCardTwo2(String vards, String uzvards, String Talr, String DzimsanasGads) {
        System.out.println("Vizītkarte");
        System.out.println("@@@@@@@@@@@@@");
        System.out.println(vards + "");
        System.out.println(uzvards + "");
        System.out.println( Talr + "");
        System.out.println(DzimsanasGads + "");
        System.out.println("@@@@@@@@@@@@@");
    }
}

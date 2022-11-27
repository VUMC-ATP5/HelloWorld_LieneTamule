package lekcijaCetri.majasDarbs.classHomework;
import lekcijaCetri.majasDarbs.classHomework.Trissturis;

public class Main {
    public static void main(String[] args) {
        Trissturis trissturis1 = new Trissturis();
        trissturis1.malaX = 15;
        trissturis1.malaY = 15;
        trissturis1.malaZ = 10;

        System.out.println(trissturis1.irVienadmalu());
        System.out.println(trissturis1.irVienadsanu());

    }
}

package lekcijaPieci.majasDrabs;

public class Cilindrs {
    public static double  r = 5;
    public double  h = 15;
    private static double pi = 3.14;
    private Object CilindrsDivi;

    public void CilindrsDivi (int i5,int i10,int i3){
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    static double rekinatLaukumu() {
        return r * r * pi;
    }
}








package lekcijaCetri.majasDarbs.classHomework;
public class Trissturis {
    int malaX;
    int malaY;
    int malaZ;
    double p;
    public double laukums;
    public Trissturis() {
        System.out.println("jauns trissturis");
    }

    public double TriangleL(int malaX, int malaY, int malaZ) {
        this.malaX = malaX;
        this.malaY = malaY;
        this.malaZ = malaZ;
        this.p = (malaX + malaY + malaZ) / 2;
        this.laukums = Math.sqrt(p * (p - malaX) * (p - malaY) * (p - malaZ));
        return laukums;
    }

    public boolean irVienadmalu() {
        System.out.println("ar malu garumiem:" + malaX + "," + malaY + " un " + malaZ + " ir vienādmalu:");
        return malaX == malaY && malaY == malaZ;
    }
    public boolean irVienadsanu() {
        System.out.println("ar malu garumiem:" + malaX + "," + malaY + " un " + malaZ + " ir vienādsānu:");
        return malaX == malaY || malaY == malaZ || malaX == malaZ;
    }
}


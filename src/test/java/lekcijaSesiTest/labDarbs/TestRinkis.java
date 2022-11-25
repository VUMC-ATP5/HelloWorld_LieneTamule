package lekcijaSesiTest.labDarbs;

import lekcijaSesi.labDarbs.Rinkis;
import org.testng.annotations.Test;


@Test
public void TestRekinatLaukumu () {

System.out.println("Tests kurš testē kā rēķinās riņķa laukums");
    Rinkis mansRinkis = new Rinkis(4.5);
    //expectedResult - sagaidāmais rezultāts
    //actualResult - reālais rezultāts
    Double expectedArea = 63.62;
    Double actualArea = mansRinkis.rekinatLaukumu();
    //assert/assertion - pārbaudes
        Assert.assertEquals(actualArea,expectedArea);

}

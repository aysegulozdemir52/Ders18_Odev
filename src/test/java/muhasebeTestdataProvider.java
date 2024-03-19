package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class muhasebeTestdataProvider {

    @Test(dataProvider = "muhasebeData")
    public void testhesaplaPrim(muhasebe kisi, boolean beklenenSonuc) {
            boolean gercekSonuc = kisi.geldigiGun > 25;
        assertEquals(gercekSonuc, beklenenSonuc);
    }

    @DataProvider(name = "muhasebeData")
    public Object[][] muhasebeData() {
        return new Object[][]{
                {createmuhasebe("Caner Önder", 27), true},// 27 gün, prim alınabilir
                {createmuhasebe("Ayşegül Özdemir", 22), false},// 22 gün, prim alınamaz
                {createmuhasebe("Seda Deniz", 28), true},// 28 gün, prim alınabilir
                {createmuhasebe("Ali Çetin", 26), true},// 26 gün, prim alınabilir
                {createmuhasebe("Gülay Albay", 23), false},// 23 gün, prim alınamaz
                {createmuhasebe("Hatice Türegün", 29), true}// 29 gün, prim alınabilir
        };
    }

    private muhasebe createmuhasebe(String isimSoyisim, int geldigiGun) {
        muhasebe kisi = new muhasebe();
        kisi.isimSoyisim = isimSoyisim;
        kisi.geldigiGun = geldigiGun;
        return kisi;
    }
}

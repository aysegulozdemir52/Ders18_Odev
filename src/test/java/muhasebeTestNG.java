package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class muhasebeTestNG {

    @Test
    public void testmuhasebePrim() {
        muhasebe kisi1 = new muhasebe();
        kisi1.isimSoyisim = "Caner Önder";
        kisi1.geldigiGun = 27;
        Assert.assertEquals(kisi1.hesaplaPrim(),"Caner Önder isimli kişi 27 gün şirkete geldiği için toplam 2000 TL kadar prim almayı hak etmiştir.");

        muhasebe kisi2 = new muhasebe();
        kisi2.isimSoyisim = "Ayşegül Özdemir";
        kisi2.geldigiGun = 22;
        Assert.assertEquals(kisi2.hesaplaPrim(), "Ayşegül Özdemir isimli kişi 22 gün şirkete geldiği için prim almaya hak kazanmamıştır.");

        muhasebe kisi3 = new muhasebe();
        kisi3.isimSoyisim = "Seda Deniz";
        kisi3.geldigiGun = 28;
        Assert.assertEquals(kisi3.hesaplaPrim(), "Seda Deniz isimli kişi 28 gün şirkete geldiği için toplam 3000 TL kadar prim almayı hak etmiştir");

        muhasebe kisi4 = new muhasebe();
        kisi4.isimSoyisim = "Ali Çetin";
        kisi4.geldigiGun = 26;
        Assert.assertEquals(kisi4.hesaplaPrim(), "Ali Çetin isimli kişi 26 gün şirkete geldiği için toplam 1000 TL kadar prim almayı hak etmiştir.");

        muhasebe kisi5 = new muhasebe();
        kisi5.isimSoyisim = "Gülay Albay";
        kisi5.geldigiGun = 23;
        Assert.assertEquals(kisi5.hesaplaPrim(), "Gülay Albay isimli kişi 23 gün şirkete geldiği için prim almaya hak kazanmamıştır.");

        muhasebe kisi6 = new muhasebe();
        kisi6.isimSoyisim = "Ali Çetin";
        kisi6.geldigiGun = 29;
        Assert.assertEquals(kisi6.hesaplaPrim(), "Hatice Türegün isimli kişi 29 gün şirkete geldiği için toplam 4000 TL kadar prim almayı hak etmiştir.");
    }
}
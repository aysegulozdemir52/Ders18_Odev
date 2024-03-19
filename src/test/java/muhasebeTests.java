package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class muhasebeTests {

    @Test
    public void testisimSoyisim() {
        muhasebe kisi = new muhasebe();
        kisi.isimSoyisim = "Caner Önder";
        kisi.isimSoyisim();
    }

    @Test
    public void testmuhasebehesapla() {
        muhasebe kisi1 = new muhasebe();
        kisi1.isimSoyisim = "Caner Önder";
        kisi1.geldigiGun = 27;
        kisi1.hesaplaPrim();

        muhasebe kisi2 = new muhasebe();
        kisi2.isimSoyisim = "Ayşegül Özdemir";
        kisi2.geldigiGun = 22;
        kisi2.hesaplaPrim();

        muhasebe kisi3 = new muhasebe();
        kisi3.isimSoyisim = "Seda Deniz";
        kisi3.geldigiGun = 28;
        kisi3.hesaplaPrim();

        muhasebe kisi4 = new muhasebe();
        kisi4.isimSoyisim = "Ali Çetin";
        kisi4.geldigiGun = 26;
        kisi4.hesaplaPrim();

        muhasebe kisi5 = new muhasebe();
        kisi5.isimSoyisim = "Gülay Albay";
        kisi5.geldigiGun = 23;
        kisi5.hesaplaPrim();

        muhasebe kisi6 = new muhasebe();
        kisi6.isimSoyisim = "Hatice Türegün";
        kisi6.geldigiGun = 29;
        kisi6.hesaplaPrim();
    }
}
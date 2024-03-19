package org.example;

public class muhasebeTest {

    public static void main(String[] args) {


        muhasebe kisi1 = new muhasebe();
        muhasebe kisi2 = new muhasebe();
        muhasebe kisi3 = new muhasebe();
        muhasebe kisi4 = new muhasebe();
        muhasebe kisi5 = new muhasebe();
        muhasebe kisi6 = new muhasebe();


        kisi1.isimSoyisim = "Caner Önder";
        kisi1.geldigiGun = 27;

        kisi2.isimSoyisim = "Ayşegül Özdemir";
        kisi2.geldigiGun = 22;

        kisi3.isimSoyisim = "Seda Deniz";
        kisi3.geldigiGun = 28;

        kisi4.isimSoyisim = "Ali Çetin";
        kisi4.geldigiGun = 26;

        kisi5.isimSoyisim = "Gülay Albay";
        kisi5.geldigiGun = 23;

        kisi6.isimSoyisim = "Hatice Türegün";
        kisi6.geldigiGun = 29;


        kisi1.hesaplaPrim();
        kisi2.hesaplaPrim();
        kisi3.hesaplaPrim();
        kisi4.hesaplaPrim();
        kisi5.hesaplaPrim();
        kisi6.hesaplaPrim();

    }
}

package org.example;

public class    muhasebe {

    String isimSoyisim;
    Integer geldigiGun;
    public byte[] hesaplaPrim() {
        if (geldigiGun > 25) {
            Integer dayCount = geldigiGun - 25;

            Integer totalPrim = 1000 * dayCount;
            System.out.println(isimSoyisim + " = " + geldigiGun + " gün şirkete geldiği için toplam " + totalPrim + " TL  prim aldı.");

        } else {
            System.out.println(isimSoyisim + " = " + geldigiGun + " gün şirkete geldiği için prim almadı.");
        }

        return new byte[0];
    }

    public void isimSoyisim() {
    }
}





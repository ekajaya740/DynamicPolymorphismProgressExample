//Subclass

public class Chou extends HeroBase {
    
    public void statsHero(){
        namaHero = "Chou";
        jenisCC = "Knock Up";
        durasiCC = 100;
    }

    @Override //Anotasi @Override yang memberitahu compiler bahwa method dibawah akan "ditumpuk" datanya
    public void crowdControl() {
        super.crowdControl(); //Mengambil isi dari superclass
        System.out.println(this.namaHero + " melakukan crowd control " + this.jenisCC + " selama " + this.durasiCC + " detik"); //Komponen yang diimplementasikan di subclass
    }
}

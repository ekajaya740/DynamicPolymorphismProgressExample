public class JametosMilos extends HeroBase {

    public void statsHero(){
        namaHero = "Jametos Milos";
        jenisCC = "Ding ding pa ding ding";
        durasiCC = 6969;
    }

    @Override
    public void crowdControl() { //Anotasi @Override yang memberitahu compiler bahwa method dibawah akan "ditumpuk" datanya
        System.out.println(this.namaHero + " melakukan crowd control " + this.jenisCC + " selama " + this.durasiCC + " dekade"); //Komponen yang diimplementasikan di subclass
    }
    /*  ^
        Tidak memiliki super sehingga tidak memanggil komponen yang ada pada superclass
    */
}

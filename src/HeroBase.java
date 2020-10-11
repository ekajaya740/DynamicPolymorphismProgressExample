//Superclass

public class HeroBase {
    protected String namaHero;
    protected String jenisCC;
    protected int durasiCC;

    public void crowdControl(){ //Method yang akan di Override subclass
        System.out.println("Hero lawan terkena Crowd Control");
    }
}

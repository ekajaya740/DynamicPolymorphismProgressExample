public class App {
    public static void main(String[] args) {
        Chou chou = new Chou();
        JametosMilos jametosMilos = new JametosMilos();

        chou.statsHero();
        jametosMilos.statsHero();

        chou.crowdControl();
        jametosMilos.crowdControl();
    }
}

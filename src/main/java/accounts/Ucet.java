package accounts;

public class Ucet {

    private final int KOD_BANKY = 1234;
    protected String cislo;
    protected String majitel;
    protected double zustatek;

    public Ucet(String cislo, String majitel, double zustatek) {
        this.cislo = cislo;
        this.majitel = majitel;
        this.zustatek = zustatek;
    }

    public Ucet(String cislo, String majitel) {
        this.cislo = cislo;
        this.majitel = majitel;
    }

    public String vlozit(double castka) {
        this.zustatek += castka;
        return String.format("Na ucet %s bylo vlozeno %.2f", this.cislo, castka);
    }

    public String vybrat(double castka) {
        if (this.zustatek - castka >= 0) {
            this.zustatek -= castka;
            return String.format("Z uctu %s vybrano %.2f, zustatek je: %.2f", this.cislo, castka, this.zustatek);
        }
        return "Prekrocen limit pro vyber";
    }

    protected String vratCisloUctuCele() {
        return String.format("%s/%d", this.cislo, this.KOD_BANKY);
    }

    @Override
    public String toString() {
        return "Ucet{" +
                "KOD_BANKY=" + KOD_BANKY +
                ", cislo='" + cislo + '\'' +
                ", majitel='" + majitel + '\'' +
                ", zustatek=" + zustatek +
                '}';
    }
}

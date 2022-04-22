package accounts;

public class DebetniUcet extends Ucet {
    
    private double debet;
    private final double MAXIMALNI_ZAPORNY_DEBET = 0 - debet;

    public DebetniUcet(String cislo, String majitel, double zustatek, double debet) {
        super(cislo, majitel, zustatek);
        this.debet = debet;
    }

    public DebetniUcet(String cislo, String majitel, double debet) {
        super(cislo, majitel);
        this.debet = debet;
    }

    public String vybrat(double castka) {
        if (!(this.zustatek - castka < MAXIMALNI_ZAPORNY_DEBET)) {
            this.zustatek -= castka;
            return String.format("Z uctu %s vybrano %.2f, zustatek je: %.2f", this.cislo, castka, this.zustatek);
        }
        return "Prekrocen limit pro vyber";
    }

    @Override
    public String toString() {
        return "DebetniUcet{" +
                ", cislo='" + cislo + '\'' +
                ", majitel='" + majitel + '\'' +
                ", zustatek=" + zustatek +
                '}';
    }
}

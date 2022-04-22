package accounts;

public class SporiciUcet extends Ucet {

    private double urokovaSazba;

    public SporiciUcet(String cislo, String majitel, double zustatek, double urokovaSazba) {
        super(cislo, majitel, zustatek);
        this.urokovaSazba = urokovaSazba;
    }

    public SporiciUcet(String cislo, String majitel, double urokovaSazba) {
        super(cislo, majitel);
        this.urokovaSazba = urokovaSazba;
    }

    public String pripsatUrok() {
        this.zustatek *= urokovaSazba;
        return String.format("Na ucet %s byla pripsana urokova sazba %.2f procent", this.cislo, this.urokovaSazba);
    }

    @Override
    public String toString() {
        return "SporiciUcet{" +
                "urokovaSazba=" + urokovaSazba +
                ", cislo='" + cislo + '\'' +
                ", majitel='" + majitel + '\'' +
                ", zustatek=" + zustatek +
                '}';
    }
}

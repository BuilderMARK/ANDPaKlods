public class Item {
    private String Ean,Navn,Navn2;
    private int Pris,VareHierkiId;

    public Item(String ean, String navn, String navn2, int pris, int vareHierkiId) {
        Ean = ean;
        Navn = navn;
        Navn2 = navn2;
        Pris = pris;
        VareHierkiId = vareHierkiId;
    }

    public Item() {
    }

    public String getEan() {
        return Ean;
    }

    public void setEan(String ean) {
        Ean = ean;
    }

    public String getNavn() {
        return Navn;
    }

    public void setNavn(String navn) {
        Navn = navn;
    }

    public String getNavn2() {
        return Navn2;
    }

    public void setNavn2(String navn2) {
        Navn2 = navn2;
    }

    public int getPris() {
        return Pris;
    }

    public void setPris(int pris) {
        Pris = pris;
    }

    public int getVareHierkiId() {
        return VareHierkiId;
    }

    public void setVareHierkiId(int vareHierkiId) {
        VareHierkiId = vareHierkiId;
    }
}

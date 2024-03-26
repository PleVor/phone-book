class Osoba extends Wpis {
    private String imie;
    private String nazwisko;
    String adres;
    private NrTelefoniczny nrTelefonu;

    public Osoba(String imie, String nazwisko, String adres, NrTelefoniczny nrTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.nrTelefonu = nrTelefonu;
    }

    @Override
    public void opis() {
        System.out.println("Osoba: " + imie + " " + nazwisko + ", adres: " + adres + ", telefon: " + nrTelefonu);
    }
}

class Firma extends Wpis {
    private String nazwa;
    String adres;
    private NrTelefoniczny nrTelefonu;

    public Firma(String nazwa, String adres, NrTelefoniczny nrTelefonu) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.nrTelefonu = nrTelefonu;
    }

    public void opis() {
        System.out.println("Firma: " + nazwa + ", adres: " + adres + ", telefon: " + nrTelefonu);
    }
}

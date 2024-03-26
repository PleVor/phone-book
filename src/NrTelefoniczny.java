import java.util.*;

class NrTelefoniczny implements Comparable<NrTelefoniczny> {
    private String nrKierunkowy;
    private String nrTelefonu;

    public NrTelefoniczny(String nrKierunkowy, String nrTelefonu) {
        this.nrKierunkowy = nrKierunkowy;
        this.nrTelefonu = nrTelefonu;
    }

    @Override
    public int compareTo(NrTelefoniczny o) {
        int compareKierunkowy = nrKierunkowy.compareTo(o.nrKierunkowy);
        if (compareKierunkowy == 0) {
            return nrTelefonu.compareTo(o.nrTelefonu);
        }
        return compareKierunkowy;
    }

    @Override
    public String toString() {
        return nrKierunkowy + " " + nrTelefonu;
    }

}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<NrTelefoniczny, Wpis> ksiazka = new TreeMap<>();

        NrTelefoniczny nr1 = new NrTelefoniczny("48", "123456789");
        Osoba osoba1 = new Osoba("Jan", "Kowalski", "ul. Prosta 1", nr1);
        ksiazka.put(nr1, osoba1);

        NrTelefoniczny nr2 = new NrTelefoniczny("48", "987654321");
        Osoba osoba2 = new Osoba("Anna", "Nowak", "ul. Kwiatowa 5", nr2);
        ksiazka.put(nr2, osoba2);

        NrTelefoniczny nr3 = new NrTelefoniczny("48", "555555555");
        Firma firma1 = new Firma("ABC Sp. z o.o.", "ul. Prosta 1", nr3);
        ksiazka.put(nr3, firma1);

        NrTelefoniczny nr4 = new NrTelefoniczny("48", "111111111");
        Firma firma2 = new Firma("XYZ Sp. z o.o.", "ul. Kwiatowa 5", nr4);
        ksiazka.put(nr4, firma2);

        System.out.println("Książka telefoniczna:");
        Iterator<Map.Entry<NrTelefoniczny, Wpis>> iteratorDisplay = ksiazka.entrySet().iterator();
        while (iteratorDisplay.hasNext()) {
            Map.Entry<NrTelefoniczny, Wpis> entry = iteratorDisplay.next();
            entry.getValue().opis();
        }

        // Eliminacja wpisów z identyczną nazwą ulicy
        Iterator<Map.Entry<NrTelefoniczny, Wpis>> iterator = ksiazka.entrySet().iterator();
        Set<String> uniqueAddresses = new HashSet<>();
        while (iterator.hasNext()) {
            Map.Entry<NrTelefoniczny, Wpis> entry = iterator.next();
            String currentAddress = null;
            if (entry.getValue() instanceof Osoba) {
                currentAddress = ((Osoba) entry.getValue()).adres;
            } else if (entry.getValue() instanceof Firma) {
                currentAddress = ((Firma) entry.getValue()).adres;
            }
            if (!uniqueAddresses.add(currentAddress)) {
                iterator.remove();
            }
        }

        System.out.println("\nKsiążka telefoniczna po usunięciu duplikatów adresów:");
        for (Map.Entry<NrTelefoniczny, Wpis> entry : ksiazka.entrySet()) {
            entry.getValue().opis();
        }
    }
}

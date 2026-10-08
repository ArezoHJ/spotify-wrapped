import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // DEL 1: Alla låtar i listan.
        ArrayList<String> latar = new ArrayList<>(Arrays.asList(
                "Blinding Lights",
                "Starboy",
                "Save Your Tears",
                "Shape of You",
                "Bad Habits",
                "Perfect",
                "As It Was",
                "Watermelon Sugar",
                "Sign of the Times",
                "Levitating"
        ));

        // DEL 3: Artisten är key och artistens låtar är values.
        HashMap<String, ArrayList<String>> artistLatar = new HashMap<>();
        artistLatar.put("The Weeknd", new ArrayList<>(Arrays.asList(
                "Blinding Lights", "Starboy", "Save Your Tears"
        )));
        artistLatar.put("Ed Sheeran", new ArrayList<>(Arrays.asList(
                "Shape of You", "Bad Habits", "Perfect"
        )));
        artistLatar.put("Harry Styles", new ArrayList<>(Arrays.asList(
                "As It Was", "Watermelon Sugar", "Sign of the Times"
        )));
        artistLatar.put("Dua Lipa", new ArrayList<>(Arrays.asList("Levitating")));

        // DEL 2: Set hämtar artisterna från låtarnas artister och sparar varje artist bara en gång.
        Set<String> artister = new HashSet<>(artistLatar.keySet());
        artister.add("The Weeknd");
        artister.add("The Weeknd");
        artister.add("Ed Sheeran");

        // DEL 4: Skriv ut sammanställningen.
        System.out.println("SPOTIFY WRAPPED\n");

        System.out.println("Alla låtar (" + latar.size() + "):");
        for (String lat : latar) {
            System.out.println(lat);
        }

        System.out.println("\nAlla artister:");
        for (String artist : artister) {
            System.out.println(artist);
        }

        System.out.println("\nArtister och deras låtar:");
        for (String artist : artistLatar.keySet()) {
            System.out.println("Låtar av " + artist + ":");
            for (String lat : artistLatar.get(artist)) {
                System.out.println(lat);
            }
        }

        System.out.println("\nAntal olika artister: " + artister.size());
        System.out.println("Antal låtar totalt: " + latar.size());
    }
}

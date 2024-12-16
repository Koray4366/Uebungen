public class Main {
    public static void main(String[] args) {

        int hoehe = 10; // Höhe des Weihnachtsbaums

        // Weihnachtsbaum zeichnen
        for (int i = 0; i < hoehe; i++) {
            // Leerzeichen für die richtige Position
            for (int j = 0; j < hoehe - i - 1; j++) {
                System.out.print(" ");
            }
            // Sterne zeichnen
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // Neue Zeile
            System.out.println();
        }

        // Stamm des Baums zeichnen
        for (int i = 0; i < 2; i++) { // Stammhöhe
            for (int j = 0; j < hoehe - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

    }
}


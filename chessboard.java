public class chessboard {
    public static void main (String[] args) {
    System.out.print("Geben Sie die Breite des Schachbretts ein: ");
    int width = new java.util.Scanner(System.in).nextInt();

    System.out.print("Geben Sie die Höhe des Schachbretts ein:");
    int height = new java.util.Scanner(System.in).nextInt();

    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            System.out.print( (j+i) % 2 == 1 ? '#' : "_");
        }
        System.out.println();

    }
}
}

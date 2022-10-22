public class Muster {

        public static void main (String[] args) {
            System.out.println("Wie viele Zeilen soll die Flagge haben?");
            int length = new java.util.Scanner(System.in).nextInt();
            for (int i = 0; i < length+1; i++) {
                for (int j = 0; j<i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        
    }
    }
    


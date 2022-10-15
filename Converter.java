public class Converter {

    public static void main(String args[]) {
        System.out.println("Bitte gib an wie viel Liter du umrechnen möchtest: ");
        double liter = new java.util.Scanner(System.in).nextDouble();
        if ( liter > 1.0) {
            System.out.println("ca. " + (int) liter + " Liter");
        } else if (liter >= 0.1 && liter < 1.0) {
            liter *= 100;
            System.out.println("ca. " + (int) liter + " cl");
        } else if (liter >= 0.001 && liter < 0.1 ) {
            liter *= 1000;
            System.out.println("ca. " + (int) liter + " ml");
        } else {
            System.out.println("Value too small to display");
        }

    }    
}

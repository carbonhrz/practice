public class Faculties {
    
    public static void main(String[] args) {
        int sum = 1;
        System.out.println("Bitte gib die zu berechnende Fakultät ein: ");
        int max = new java.util.Scanner(System.in).nextInt();
        if (max < 0) {
            System.err.println("Keine negativen Zahlen!");
        } else if (max >= 0) {
        System.out.print(max + "! = ");
        for (int i = 1; i < max; i++) {
            System.out.print(i + " * ");
        }
        System.out.print(max + " ");
        for (int j = 1; j <= max; j++) {
            sum *= j;
        }
        System.out.println("= " + sum);
        
    }
}

}

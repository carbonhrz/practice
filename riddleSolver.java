public class riddleSolver {


// Program for Brute Force that iterates through all posibilities for given problem
// X = Every digit is different
    public static void main(String[] args) {
        int X, O, L, T;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        X = i;
                        O = j;
                        L = k;
                        T = l;
                        if (X+L==T && O+X==L && L+X==T) {
                            if (X != L && X != O && X != L && X != T && O != L && O != T && L != T)
                            System.out.println("X:" + X + " O:" + O + " L:"+ L + " T:" + T + " (X)");
                            else {
                                System.out.println("X:" + X + " O:" + O + " L:"+ L + " T:" + T);
                            }
                        }               
                    }
                }
            }
        }
    }
}

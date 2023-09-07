public class Pattern23 {
    
        public static void printPattern(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    char nCh = (char)('A' + i + j);
                    System.out.print(nCh + " ");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            int n = 5;
            printPattern(n);
        }
    
}

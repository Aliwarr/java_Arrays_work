public class Pattern18 {
    public static void printPattern(int n){
        char ch = (char)('A'+n);
        for(int i=0;i<n;i++){
            for(int j=i+1;j> 0;j--){
                System.out.print((char)(ch-j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }
}

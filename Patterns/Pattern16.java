public class Pattern16 {
    public static void printPattern(int n){
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch+i)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }
}

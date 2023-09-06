public class Pattern17 {
    public static void printPattern(int n){
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<=2*i ;j++){
                if(j<=i){
                    System.out.print((char)(ch+j));
                }
                else{

                    System.out.print((char)(ch + 2 * i - j));
                }
                
            }

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }
}

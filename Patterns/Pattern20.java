public class Pattern20 {
    public static void printPattern(int n){
        for(int i=0;i<2*n -1;i++){
            if(i<n){
                for(int j=0;j<=i;j++){
                System.out.print("*");
                }
                for(int j=0;j<2*(n-i-1);j++){
                    System.out.print(" ");
                }
                for(int j=i;j>=0;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=0; j<2*(n-1)-i+1;j++){
                    System.out.print("*");
                }
                for(int j=0;j<2*(i-n)+2;j++){
                    System.out.print(" ");
                }
                for(int j=0; j<2*(n-1)-i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }
}

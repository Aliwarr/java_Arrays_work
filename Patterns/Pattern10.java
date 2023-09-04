public class Pattern10 {
    public static void printPattern(int n){
        for(int i=0;i<2*n-1;i++){
            if(i<=n-1){
                for(int j=0;j<i+1;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=0;j<2*n-i-1;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }
}

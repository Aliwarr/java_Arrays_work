public class Pattern21 {
    public static void printPattern(int n){
        for(int i=0;i<n;i++){
            if(i==0 || i==(n-1)){
                for(int j=0;j<n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                System.out.print("* ");
                for(int j=0;j<n-2;j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }
}

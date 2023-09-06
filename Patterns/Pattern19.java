public class Pattern19 {
    public static void upperHalf(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void lowerhalf(int n){
        for(int i=0;i<n;i++){
            for(int j=0; j<i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPattern(int n){
        upperHalf(n);
        // System.out.println();
        lowerhalf(n);
    }
    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }
}

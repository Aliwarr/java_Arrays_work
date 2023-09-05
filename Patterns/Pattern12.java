public class Pattern12 {
    public static void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0; j<i+1;j++){
                System.out.print(j+1);
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }
}

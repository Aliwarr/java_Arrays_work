public class Pattern13 {
    public static void printPattern(int n){
        int sum=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(sum+ " ");
                sum+=1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }
}

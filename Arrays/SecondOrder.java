package practice.Arrays;

public class SecondOrder {
    public static int[] getSecondOrderElements(int n, int []a) {


        //  optimal approach for second Largest and second Smallest number in array
        //  time complexity : O(n)




        int sLargest = sLargest(n, a);
        int sSmallest = sSmallest(n, a);

       
        
        return new int[]{sLargest,sSmallest};
    }
        public static int sLargest(int n,int[]a){
            int largest=a[0];
            int sLargest=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(a[i]>largest){
                    sLargest=largest;
                    largest=a[i];
                }
                else if(a[i]<largest && a[i]>sLargest){
                    sLargest=a[i];
                }
            }
            return sLargest;
        }

        public static int sSmallest(int n,int[]a){
            int sSmallest=Integer.MAX_VALUE;
            int smallest=a[0];
            for(int i=0;i<n;i++){
                if(a[i]<smallest){
                    sSmallest=smallest;
                    smallest=a[i];
                }
                else if(a[i]!=smallest && a[i]<sSmallest){
                    sSmallest=a[i];
                }
            }
            return sSmallest;
        }

        public static void main(String[] args) {
            int[]arr={4,3,2,5,6,3,2};
            int n=arr.length;
            int [] ans= getSecondOrderElements(n,arr);
            System.out.println(ans[0]+"  "+ans[1]);
        }
}
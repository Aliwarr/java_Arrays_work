package practice.Arrays;


public class LargestElement{

    // brute force Technique 
    //  time complexity : O(nlogn)


    // public int largestNo(int[]arr){
    //     int n=arr.length;
    //     Arrays.sort(arr);
    //     return arr[n-1];
    // }


    // better Solution
    // time complexity: O(n)

    public int largestNo(int[]ar){
        int n=ar.length;
        int large=ar[0];
        for(int i=1;i<n;i++){
            if(ar[i]>large)
                large=ar[i];
        }
        return large;
    }
    public static void main(String[] args) {
       
        int arr[]={3,2,1,5,2};
         LargestElement le = new LargestElement();
        int ans=le.largestNo(arr);
        System.out.println(ans);
    }


    
}
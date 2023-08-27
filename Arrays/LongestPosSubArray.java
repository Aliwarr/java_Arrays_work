public class LongestPosSubArray {
    // brute force approach
    // time complexity O(n3)

    public static int longestSubArr(int[]arr, long k){
        int n=arr.length;
        int maxLen=0;
        
        for(int i=0;i<n;i++){
           long sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

    // optimal approach 
    // time complexity O(2n)
    // space complexity O(1)

    // public static int longestSubArr(int[]arr, long k){
    //     int n =arr.length;
    //     int maxLen=0;
    //     long sum=arr[0];
    //     int left=0, right=0;
    //     while(right<n){

    //         while(sum>k && left<=right){
    //             sum-=arr[left];
    //             left++;
    //         }
            
    //         if(sum==k){
    //             maxLen=Math.max(maxLen,right-left+1);
    //         }
    //         right++;
    //         if(right<n){
    //             sum+=arr[right];
    //         }
    //     }


    //     return maxLen;

    // }
    public static void main(String[] args) {
       

        int[] arr = new int[]{1,2,3,1,1,1,1};
        int k=3;

        int ans= longestSubArr(arr,k);
        System.out.println(ans);
        

    }
}

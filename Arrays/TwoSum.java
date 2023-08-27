import java.util.Arrays;

public class TwoSum {

    // optimal than two for loops
    //  time comlexity O(n)+O(nlogn)

    
    public static int[] twoSum(int arr[],int target){
        int n = arr.length;
        Arrays.sort(arr);
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                return new int[]{arr[left],arr[right]};
            }
            else if(arr[left]+arr[right]< target){
                left++;
            }
            else{
                right--;
            }
        }

        return  new int[]{-1,-1};
    }

    // brute force approach
    // time complexity  O(n2)

    // public static int[] twoSum(int[]arr, int target){
    //     int n=arr.length;
    //     for(int i=0; i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]+arr[j]==target)
    //                 return new int[]{i,j};
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }
    public static void main(String[] args) {
        int arr[]=new int[]{2,11,6,5,8};
        int target=19;
        int ans[] = twoSum(arr,target);
        System.out.println(ans[0]+ " "+ans[1]);
    }
}

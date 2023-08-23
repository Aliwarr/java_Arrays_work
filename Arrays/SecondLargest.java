package practice.Arrays;


public class SecondLargest {

    // brute force approach
    // time complexity: O(nlogn)+O(n)


    // public int secondNo(int[]arr){
    //     int n=arr.length;
    //     Arrays.sort(arr);
    //     int ans=arr[n-1];
    //     for(int i=n-2;i>=0;i--){
    //         if(arr[i]!=ans){
    //             ans=arr[i];
    //             break;
    //         }
    //     }
    //     return ans;
    // }



    //  better approach 
    // time complexity O(n)+O(n)

    // public int secondNo(int[] arr){
    //     int num1=firstlargest(arr);
    //     int num2=secondLargest(arr,num1);
    //     return num2;
    // }
    // public int firstlargest(int[] arr){
    //     int n=arr.length;
    //     int largest=arr[0];
    //     for(int i=1;i<n;i++){
    //         if(arr[i]>largest){
    //             largest=arr[i];
    //         }
    //     }
    //     return largest;
    // }
    // public int secondLargest(int[] arr,int num1){
    //     int n=arr.length;
    //     int secondLarge=-1;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>secondLarge && arr[i]!=num1){
    //             secondLarge=arr[i];
    //         }
    //     }
    //     return secondLarge;
    // }


    // optimal approach
    // time complexity: O(n)

    public int secondNo(int[]arr){
        int largest=arr[0];
        int sLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>sLargest){
                sLargest=arr[i];
            }
        }
        return sLargest;
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,2,7,3,7,6,4};
        SecondLargest sl= new SecondLargest();
        int ans= sl.secondNo(arr);
        System.out.println(ans);
    }
}

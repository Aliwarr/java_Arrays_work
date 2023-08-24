public class LeftRotate {

    // brute force approach
    // time complexity O(n+d)
    // space complexity O(d)

    // public static void rotateLeft(int []arr, int d){
    //     int n=arr.length;
    //     int temp[]=new int[d];
    //     for(int i=0;i<d;i++){
    //         temp[i]=arr[i];
    //     }
    //     for(int i=0;i<n-d;i++){
    //         arr[i]=arr[i+d];
    //     }
    //     int j=0;
    //     for(int i=n-d;i<n;i++){
    //         arr[i]=temp[j];
    //         j++;
    //     }

    // }



    // optimal approach
    // time complexity O(2n)
    // space complexity O(1)



    public static void rotateLeft(int[]arr, int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    public static void reverse(int[]arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 1, 6, 8, 3, 9, 7};
        int d = 4;
        rotateLeft(arr,d);

        for(int nums: arr){
            System.out.print(nums+" ");
        }
    }
}

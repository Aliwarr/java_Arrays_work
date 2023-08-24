public class MoveAllZero {


    // optimal approach
    // time cmplexity O(n)
    // space complexity O(1)


    public static void moveZero(int[]arr, int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                j=i;
                break;
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                swap(arr,i,j+1);
                j=j+1;
            }
        }
    }
    public static void swap(int[]arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
       arr[ b]=temp;
    }

    // brute force approach
    // time compexity O(2n)
    // space complexity O(n)


    // public static void moveZero(int []arr,int n){
    //     int[]temp=new int[n];
    //     int j=0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]!=0){
    //             temp[j]=arr[i];
    //             j++;
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         arr[i]=temp[i];
    //     }
    // }
    public static void main(String[] args) {
        int arr[]={1,2,0,3,0,4,0,0,0,5,8,0,7,9,0,3};
        int n=arr.length;
        moveZero(arr,n);
        for(int nums : arr){
            System.out.print(nums+" ");
        }
    }
}

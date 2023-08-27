public class Sort012 {

    // brute force approach
    // time comlexity O(2n)

    
    public static void sort(int[]arr, int n){
        int count0=0,count1=0,count2=0;
        for(int i: arr){
            if(i==0)
                count0++;
            else if(i==1)
                count1++;
            else
                count2++;
        }
        for(int i=0;i<count0;i++)
            arr[i]=0;
        for(int i=count0; i<count0+count1;i++)
            arr[i]=1;
        for(int i=count0+count1; i<count0+count1+count2;i++)
            arr[i]=2;
    }

    // Dutch National Flag Theorem
    // optimal solution
    // time complexity: O(n)
    // space complexity : O(1)
    
    // public static void sort(int[]arr,int n){
    //     int low=0, mid=0, high=n-1;

    //     while(mid<=high){
    //         if(arr[mid]==0){
    //             swap(arr,low,mid);
    //             mid++;
    //             low++;
    //         }
    //         else if(arr[mid]==1){
    //             mid++;
    //         }
    //         else{
    //             swap(arr,mid,high);
    //             high--;
    //         }
            
            
            
    //     }
    // }

    // public static void swap(int[]arr, int a, int b){
    //     int temp=arr[a];
    //     arr[a]=arr[b];
    //     arr[b]=temp;
    // }
    public static void main(String[] args) {
        int[] arr= new int[]{1,1,1,2,1,0,0,2,2,2,2,1,1,1,1,0,0,0,2,2,2,1,1,1,0};
        int n= arr.length;
        sort(arr,n);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    
}

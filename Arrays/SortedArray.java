

public class SortedArray {
    public int sortAns(int[]arr,int n){
        int ans=1;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                ans=0;
                break;
            }
        }

        return ans;
    }
   public static void main(String[] args) {
    SortedArray sa=new SortedArray();
    int arr[]={1,2,4,4,6,7,9,9};
    int n=arr.length;
    int ans=sa.sortAns(arr,n);
    if(ans==1)
        System.out.println("The array is sorted");
    else   
        System.out.println("Array is not sorted");

   } 
}

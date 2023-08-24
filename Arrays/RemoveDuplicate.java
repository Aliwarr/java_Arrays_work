import java.util.Arrays;

public class RemoveDuplicate {

    public int[] solveDuplicate(int[]arr,int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i=i+1;
            }
        }
        return Arrays.copyOf(arr, i + 1);
    }
    public static void main(String[] args) {
        int[] arr= {1,1,3,3,3,4,4,4,5};
        int n=arr.length;
        RemoveDuplicate rd= new RemoveDuplicate();
        int[] ans=rd.solveDuplicate(arr,n);
        System.out.print("removed duplicate numbers array is: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

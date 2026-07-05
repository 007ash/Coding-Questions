public class CheckAnArrayIsSorted{

    //Iterative method (Brute Force)
    // time O(n) and Space O(1)
    static boolean isSorted(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }

    //Recursive approach (Recurstion)
    //time O(n) and space O(n)
    static boolean isSortedHelper(int[] arr, int n){
        if(n==0 || n==1) return true;
        return arr[n-1] >= arr[n-2] && isSortedHelper(arr, n-1);
    }
    static boolean isSortedRec(int[] arr){
        return isSortedHelper(arr, arr.length);
    } 

    public static void main(String[] args){
        int[] nums = {1,2,2};
        System.out.println(isSorted(nums));
        System.out.println(isSortedRec(nums));
    }
}
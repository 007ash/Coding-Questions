//LeetCode Problem:88
import java.util.Arrays;
public class MergeSortedArray {
    
    //Brute Force method 
    static void merge1(int[] num1, int m, int[] num2, int n){
        for(int i=0; i<n; i++){
            num1[m+i]= num2[i];
        }
        Arrays.sort(num1);
    }

    //three-pointer method
    static void merge2(int[] num1, int m, int[] num2, int n){
        int i = m-1, j = n-1, k = m+n-1;
        while(i>=0 && j>=0){
            if(num1[i] <= num2[j]){
                num1[k] = num2[j];
                j--; k--;
            } else {
                num1[k] = num1[i];
                k--; i--;
            }   
        }
    }
}

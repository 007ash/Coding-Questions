import java.util.Scanner;
public class CountDigitsInNumber {

    //Iterative method (Brute Force)
    //time O(n)/O(log(n)) and space O(1)
    static int numberOfDigits(int num){
        
        if(num == 0) return 1;
        int count = 0;
        while(Math.abs(num) > 0){
            num /= 10;
            count++;
        }
        return count;
    }

    //Recurive Method
    //Time O(log(n)) and Space O(n)
    static int numberOfDigitsRec(int num){
        if(num/10 == 0) return 1;
        return 1 + numberOfDigitsRec(num/10);
    }

    //Integer to String method
    //Time O(n) and space O(n)
    static int numberOfDigitsInt2Str(int num){
        String numStr = Integer.toString(num);
        if(numStr.charAt(0) == '-') return numStr.length()-1;
        return numStr.length();
    }

    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = 000;
        System.out.println(numberOfDigits(number));
        System.out.println(numberOfDigitsRec(number));
        System.out.println(numberOfDigitsInt2Str(number));
    }
}

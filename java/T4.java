import java.util.Scanner;

public class T4 {
    private static boolean isPalindrome(String str){
        str=str.replaceAll("AZ","").toLowerCase();

        int left =0;
        int right=str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String word=scanner.nextLine();

        if(isPalindrome(word)){
            System.out.println("It is a palindrome!");
        }else{
            System.out.println("It is not a palindrome!");
        }
    }
}

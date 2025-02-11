package Day6;

public class Palindrome {
		  protected boolean checkPalindrome(String str, int right, int left) {
		        if (right >= left) {
		            return true;
		        }
		        if (str.charAt(right) != str.charAt(left)) {
		            return false;
		        }
		        return checkPalindrome(str, right + 1, left - 1);
		    }

}

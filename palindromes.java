public class Main {
 public static void main(String[] args) {
  String str1 = "madam"; 
  String str2 = "madam"; 

 
  if (arePalindromesOfEachOther(str1, str2)) {
   System.out.println(str1 + " and " + str2 + " are palindromes of each other.");
  } else {
   System.out.println(str1 + " and " + str2 + " are not palindromes of each other.");
  }
 }

 public static boolean arePalindromesOfEachOther(String str1, String str2) {

  if (str1.length() != str2.length()) {
   return false;
  }

  // Check if str1 is the reverse of str2
  for (int i = 0; i < str1.length(); i++) {
   if (str1.charAt(i) != str2.charAt(str2.length() - 1 - i)) {
    return false; 
   }
  }
  return true; 
 }
}

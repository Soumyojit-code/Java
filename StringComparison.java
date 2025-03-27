public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";

  
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal.");
        } else {
            System.out.println("str1 and str2 are not equal.");
        }

        if (str1.equals(str3)) {
            System.out.println("str1 and str3 are equal.");
        } else {
            System.out.println("str1 and str3 are not equal.");
        }
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult < 0) {
            System.out.println("str1 is lexicographically less than str2.");
        } else if (comparisonResult > 0) {
            System.out.println("str1 is lexicographically greater than str2.");
        } else {
            System.out.println("str1 is lexicographically equal to str2.");
        }
    }
}

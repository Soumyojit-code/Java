// https://leetcode.com/u/soumyojitbanerjee/


/** Smallest Palindromic Rearrangement I(https://leetcode.com/problems/smallest-palindromic-rearrangement-i/description/?envType=daily-question&envId=2026-07-28)
You are given a palindromic string s. Return the lexicographically smallest palindromic permutation of s.
**/


class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        char[] half = s.substring(0, n / 2).toCharArray();
        Arrays.sort(half);
        String sortedHalf = new String(half);
        StringBuilder res = new StringBuilder(sortedHalf);
        if (n % 2 == 1) {
            res.append(s.charAt(n / 2));
        }
        res.append(new StringBuilder(sortedHalf).reverse());
        return res.toString();
    }
}

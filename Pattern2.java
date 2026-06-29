//a b c d e f g
//  a b c d e
//    a b c
//      a

public class Pattern2 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            char ch = 'a';
            int totalChars = 2 * (n - i) - 1;
            for (int j = 0; j < totalChars; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

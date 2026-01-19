//Remove duplicate character from a string
public class String4
{
    public static void main(String[] args)
    {
        String str = "programming";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (sb.indexOf(String.valueOf(c))== -1)
            {
                sb.append(c);

            }
        }

      System.out.println(sb.toString());
    }
}
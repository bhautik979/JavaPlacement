public class stringCompress {
    public static String stringCompress(String str) {
        StringBuilder stb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {

            Integer count = 0;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)  ) {

                count++;
                i++;
            }
            count++;
            stb.append(str.charAt(i));     //Add character
            if (count > 1) {
                stb.append(count.toString());     //Add number if count is > 1
            }

        }
        return stb.toString();
    }

    public static void main(String []args)
    {
        String str="aabcc";
        System.out.println(stringCompress(str));
    }
}

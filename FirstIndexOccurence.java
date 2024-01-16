public class FirstIndexOccurence {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        FirstIndexOccurence obj = new FirstIndexOccurence();
        System.out.println(obj.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int needleLen = needle.length();
        if (hayLen < needleLen)
            return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

}

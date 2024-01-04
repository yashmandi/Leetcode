import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(s));
    }

    static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();

        if (strs == null || strs.length == 0) {
            return ans.toString();
        }

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                ans.append(first.charAt(i));
            } else {
                break;
            }
        }

        return ans.toString();
    }
}

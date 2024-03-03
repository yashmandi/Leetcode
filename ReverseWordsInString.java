public class ReverseWordsInString {
    public String reverseWords(String s) {
        // trim the given string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        // initialize the output string
        String out = "";

        // iterate through words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // add the current word and space to the output
            out = out + str[i] + " ";
        }

        // append the first word to output (without trailing space)
        return out + str[0];
    }
}

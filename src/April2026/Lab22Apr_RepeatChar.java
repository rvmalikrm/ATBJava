package April2026;

public class Lab22Apr_RepeatChar {
    public static void main(String[] args) {
        String input = "hello world";
        char target = 'o';
        int count = countOccurrences(input, target);
        System.out.println("The character '" + target + "' appears " + count + " times in the string \"" + input + "\".");

    }
    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}

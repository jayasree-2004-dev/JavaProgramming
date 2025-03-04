class StringProgram2 {
    public static String s = "Hello java I am a developer";

    public static String CheckStringIsEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        String[] words = str.split("\\s+"); 
        String longestWord = "";

       
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        if (isPalindrome(longestWord)) {
            return longestWord.charAt(0) + " " + longestWord.charAt(longestWord.length() - 1);
        } else {
            return extractVowels(longestWord);
        }
    }

    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String extractVowels(String word) {
        StringBuilder vowels = new StringBuilder();
        for (char c : word.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels.append(c);
            }
        }
        return vowels.toString();
    }

    public static void main(String[] args) {
        String result = CheckStringIsEmpty(s);
        System.out.println("Result: " + result);
    }
}
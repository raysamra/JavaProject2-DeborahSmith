public class T5 {
         public static boolean areAnagrams(String str1, String str2) {

            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            if (str1.length() != str2.length()) {
                return false;
            }

            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                if (str2.indexOf(ch) == -1) {
                    return false;
                }
                str2 = str2.replaceFirst(String.valueOf(ch), "");
            }
            return str2.isEmpty();
        }

        public static void main(String[] args) {

            String word1 = "listen";
            String word2 = "silent";

            if (areAnagrams(word1, word2)) {
                System.out.println(word1 + " and " + word2 + " are anagrams.");
            } else {
                System.out.println(word1 + " and " + word2 + " are not anagrams.");
            }
        }
    }

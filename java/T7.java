public class T7 {
         public static int countWords(String str) {
            int wordCount = 0;
            boolean word = false;

            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if (!word) {
                        wordCount++;
                        word = true;
                    }
                } else {
                    word = false;
                }
            }
            return wordCount;
        }

        public static void main(String[] args) {
            String str = "Hello, world!";
            int wordCount = countWords(str);
            System.out.println("Number of words: " + wordCount);
        }
    }


public class T3 {
    String reverseWord(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
    public static void main(String[] args) {
        T3 w=new T3();
        String input="Hello";
        String word=w.reverseWord(input);

        System.out.println("Before: "+input);
        System.out.println("After: "+word);
    }

}
